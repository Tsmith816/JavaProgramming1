package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char[] letters = new char[26];

        char ch = 'Z';
        for (int i = 0, j = 'Z'; i < letters.length; i++, j++){
            letters[i] = ch;
        }

        System.out.println(Arrays.toString(letters) );
        // System.out.println(letters[0]);



    }

}
