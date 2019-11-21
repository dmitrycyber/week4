import com.ivoninsky.task1.*;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        //Task2
        System.out.println("===TASK 2===");
        Picture p = new Picture();
        Figure f = new Square(7);
        Figure z = new Rectangle(5, 3);
        Figure u = new Circle(5);
        Figure u1 = new Circle(6);
        Figure o = new Sphere(5);
        Figure i = new Square(2);
        p.addToPicture(f);
        p.addToPicture(z);
        p.addToPicture(u);
        p.addToPicture(u1);
        p.addToPicture(o);
        p.addToPicture(i);
        System.out.println(p.namesOfFigures());
        System.out.println(p.sumPerimetersOfFigures());
        System.out.println(p.sumAreasOfFigures());
        //Task3
        System.out.println("===TASK 3===");
        System.out.println(p.getMapWithNamesAndCountOfFigures());
        //Task4
        System.out.println("===TASK 4===");
        BattleShip b = new BattleShip(20, 2);
        b.getField();
        b.printField();
        //Task5
        System.out.println("===TASK 5===");
        Mathematics mathematics = new Mathematics();
        int[] array1 = new int[]{5};
        int[] array2 = new int[]{};
        System.out.println(Arrays.toString(mathematics.sumOfTwoElement(array1, array2)));

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(5);
        list2.add(8);
        System.out.println(mathematics.sumOfTwoElement(list1, list2));

        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        map1.put("I", "am");
        map2.put("He", "is");
        System.out.println(mathematics.sumOfTwoElement(map1, map2));


    }

}
