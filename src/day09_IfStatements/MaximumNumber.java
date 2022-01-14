package day09_IfStatements;

public class MaximumNumber {

    public static void main(String[] args) {

        int num1 = 69,
                num2= 76;

        boolean num1IsMax = num1>num2;
        boolean num2IsMax = num2>num1;

        if (num1IsMax) {
            System.out.println(num1 + " is the maximum number");
        }
        else{
            System.out.println(num2 + " is the maximum number");
        }

    }
}
