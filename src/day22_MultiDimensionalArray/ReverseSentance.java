package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentance {

    public static void main(String[] args) {

        String sentance = "Today is a good day to learn Java";

        String[] words = sentance.split(" ");

        System.out.println(Arrays.toString(words));

        String reversedSentance = "";

        for (int i = words.length -1; i >= 0; i-- ){
            reversedSentance += words[i] + " ";
        }

        System.out.println(reversedSentance);


    }

}
