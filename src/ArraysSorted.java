import java.util.Arrays;

public class ArraysSorted {
    int[] array;

    public ArraysSorted(int[] array){
        this.array = array;
    }

    public int[] sort(){
        Arrays.sort(array);
        return array;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < array.length; i++) {
            s += array[i] + " ";
        }
        return s;

    }
}
