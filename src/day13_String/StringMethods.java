package day13_String;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String word = "cydeo";

        char thirdChar = word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);
       /*
        char tenthChar = word.charAt(9);
        System.out.println("tenthChar = "+ tenthChar);
        */

        System.out.println("-------------------------------------");

        String s1 = "Batch 25 is the best batch";

        int toatalChars = s1.length();

        System.out.println("toatalCahrs = "+ toatalChars);

        char lastChar = s1.charAt(s1.length()-1);
        System.out.println("lastChar = "+ lastChar);

        System.out.println("-------------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase();

        System.out.println(str);

        String s = "JAVA";
        


    }
}
