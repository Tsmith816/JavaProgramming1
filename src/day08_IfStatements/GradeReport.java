package day08_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        /*
        System.out.println( true == !false); // true
        System.out.println( !true != false); // false
        System.out.println( !false == true); // true

        System.out.println(!!false); // false
        System.out.println(!!!true); //false
         */

        int score = 69;

        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && !a; // if score is not A but score is greater than 80
        boolean c = !a && !b && score >= 70; // if score is not B but score is greater than 70
        boolean d = score >= 60 && score <= 69; // if score is not C but score is greater than 60
        boolean f = score >= 0 && score <= 59;

        if (a) {
            System.out.println("Excelent");
        }

        if (b) {
            System.out.println("Great");
        }

        if (c) {
            System.out.println("Good");
        }

        if (d) {
            System.out.println("Passed");
        }

        if (f) {
            System.out.println("Failed");
        }

        /*
        Score;
            90~100 ==> Excellent
            80~89  ==> Great
            70~79  ==> Good
            60~69  ==> Passed
             0~59  ==> Failed
         */

    }
}
