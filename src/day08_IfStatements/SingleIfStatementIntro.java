package day08_IfStatements;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int number = 101;

        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = !evenNumber;

        if (evenNumber) {
            System.out.println(number + " is even number");
        }

        if (oddNumber) {
            System.out.println(number+" is odd number");

            System.out.println("---------------------------------------------------");


            //positive
            int n = 200;
            if(n > 0){ // if the n is greater than zero, then it is positive
                System.out.println(n+" is positive");
            }

            //negative
            if (n < 0){ // if the n is less than zero, than its negative
                System.out.println(n+" is negative");
            }

            //zero
            if (n == 0){ // if n is equal to zero, than it is zero
                System.out.println(n+" is zero");
            }

        }


    }
}