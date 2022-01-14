package day20_Arrays;

import day03_EscapeSequences.EscapeSequences;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        //store the elements
        int[] numbers = {10, 20, 50, 70}; // size is 4

        System.out.println(Arrays.toString(numbers));

        System.out.println("--------------------------------------");

        int[] scores = new int[5];
        scores[1]= 84;
        scores[scores.length -1]= 95;
        scores[3]= 75;
        scores[0]= 65;
        scores[2]= 55;


        System.out.println(Arrays.toString(scores));





    }

}
