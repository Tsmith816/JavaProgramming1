package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();

        System.out.println("Enter your building number");
        String building = scan.next();

        scan.nextLine();

        System.out.println("Enter your Street name");
        String street = scan.nextLine();

        System.out.println("Enter City Name");
        String city = scan.nextLine();
        scan.close();
    }
}
