package day13_String;

import java.util.Scanner;

public class Initial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        String intial = f + "." + l;

        String initial = "initial = " + intial;


scan.close();


    }
}
