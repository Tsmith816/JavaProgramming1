package day10_NestedIf;

public class TerneriesIntro {

    public static void main(String[] args) {
        int n = 100;

        if (n%2 == 0){
            System.out.println("Even"); //String
        }
        else{
            System.out.println("Odd"); //String
        }

        System.out.println("-------------------------------");
        String result1 = (n%2 == 0)? "Even" : "Odd";

        System.out.println(result1);

        System.out.println("-------------------------------");

        int age = 76;
        if (age >= 21){
            System.out.println("Eligible"); //String
        }
        else{
            System.out.println("Ineligible"); //String
        }

        System.out.println("-------------------------------");

        String result2 = (age >= 21)? "Eligible" : "Ineligible";
        System.out.println(result2);


        System.out.println("-------------------------------");



        /* if (number>0){
            System.out.println("Positive");
        }
        else if (number<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        } */
        int number = 50;
        System.out.println("-------------------------------");


        String result3 = (number>0)? "Positive" :(number<0)? "Negative" : "Zero";
        System.out.println(result3);


    }
}
