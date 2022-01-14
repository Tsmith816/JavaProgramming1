package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {
        //123Enter

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your Programming Language: ");
        String programming = input.nextLine();

        System.out.println("Enter your age:");
        int age = input.nextInt();

        System.out.println("Enter your school name");
        String schoolName = input.nextLine();

        input.nextLine();//Enter

        System.out.println("fullName = "+ fullName);
        System.out.println("programming = "+ programming);
        System.out.println("school name = "+ schoolName);
        System.out.println("age = "+ age);


        input.close();












    }
}
