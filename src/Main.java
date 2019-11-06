import com.ivoninsky.task1.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;


public class Main {
    public static void main(String[] args) {
        /*Picture p = new Picture();
        Figure f = new Square(7);
        Figure z = new Rectangle(5, 3);
        Figure u = new Circle(5);
        Figure u1 = new Circle(6);
        Figure o = new Sphere(5);

        p.addToList(f);
        p.addToList(z);
        p.addToList(u);
        p.addToList(u1);
        p.addToList(o);
        System.out.println(p.getMapWithNamesAndCountOfFigures());*/

        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.add("123", "345"));































        /*String[] names = new String[]{"Vasya", "Petya"};
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(i, names[i]);
        }
        System.out.println(map);

        List<Integer> list = new ArrayList<>();
        Random r = new Random();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            list.add(r.nextInt(10));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        float average = (float) sum / list.size();
        System.out.println("sum = " + sum + "; average = " + average);

        List<String> list1= new ArrayList<>();
        list1.add("RRR");
        list1.add("TTT");
        list1.add("YYY");
        list1.add("TTT");
        System.out.println(list1);
        Set<String> set = new HashSet<>(list1);
        for (String s : set) {
            System.out.printf ("City: %s\t", s);

        }

        Map<String, Integer > map = new HashMap<>();
        map.put("Minsk", 1_000_000);
        map.put("Grodno", 900_000);
        map.put("Mogilev", 800_000);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("City %s, population %d%n", entry.getKey(), entry.getValue());
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(3);
        set1.add(2);
        set1.add(1);
        set2.add(3);
        set2.add(2);
        set2.add(1);
        set2.add(4);
        boolean b = false;
        if (set1.size() != set2.size()) {
            b = false;
        }
        else {
            for (Integer i : set1) {
                if (!set2.contains(i)){
                    b = false;
                }
            }
            b = true;
        }

        System.out.println(b);*/


        //System.out.println(set1.equals(set2));


    }

}
