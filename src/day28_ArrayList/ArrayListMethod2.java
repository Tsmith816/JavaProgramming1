package day28_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);
        /*
        int num = 1;
        list.remove(num);
         */

        Integer num = 200;
        //list.remove(200);
        boolean r = list.remove(num);
        System.out.println(list);
        System.out.println(r);

        System.out.println("--------------------------------");

        System.out.println(list.size());
        list.clear();

        System.out.println(list.size());
        list.clear();


        System.out.println("------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        System.out.println(list1 == list2);
        System.out.println(list1.equals(list2));

        System.out.println("-------------------------------------");
        list1.isEmpty();
        boolean r4 = list1.isEmpty();
        System.out.println(r4);

        System.out.println("-------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        // bulk operation
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        System.out.println(numbers);






    }

}
