package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        String[] group1 = {"Jon", "Jones", "James"};
        String[] group2 = {"Jon", "Jones", "James"};
        String[] group3 = {"Jon", "Jones", "James"};

        String[][] groups = new String[3][]; //index: 0,1,2
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        //System.out.println(Arrays.toString(groups)); // toString() is for 1 dimensional array
        System.out.println(Arrays.deepToString(groups)); //deepToString is for multi-dimensional array

        System.out.println("--------------------------------------------------");

        int[][] arr2D = { {1,2,3} , {4,5,6,7} , {8,9,10,11,12} };

        System.out.println( Arrays.deepToString(arr2D) );

        System.out.println( Arrays.toString(arr2D[1]) );

        System.out.println(arr2D[2][3]);



    }

}
