package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(10 + 20); // 30
        System.out.println(100 - 50); // 50
        System.out.println(10*6); // 60
        System.out.println(100/3.0); // 33.3333333 must have a decimal in one of the numbers being divided
        System.out.println();

        int a = 100;
        double b = a/6;

        System.out.println(b);

        double c = a/6.0;

        System.out.println(c);

    }


}
/*
+: addition
-: subtraction
*: multiplication
/: division
        in math:
            10/4 = 2.5
        in java:
            10/4 =2
            10.0/4 = 2.5
%: remainder
 */