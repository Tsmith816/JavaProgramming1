package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        int score = 95;

        if (score >= 0 && score <= 100) {
            //5 possibilities: A, B, C, D, F
            if (score >= 90) { //false: score < 90
                System.out.println("Excellent");
            } else if (score >= 80 && score < 90) {
                System.out.println("Great");
            } else if (score >= 70) {
                System.out.println("Good");
            } else if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }


            } else {
                System.out.println("Invalid Score");
            }

        System.out.println("------------------------------------------");
        int score1 = 95;
        String result = ""; //Temporary

        if (score >= 0 && score <= 100) {
            //5 possibilities: A, B, C, D, F
            if (score >= 90) { //false: score < 90
                result = ("Excellent");
            } else if (score >= 80 && score < 90) {
                result =("Great");
            } else if (score >= 70) {
                result = ("Good");
            } else if (score >= 60) {
                result = ("Passed");
            } else {
                result = ("Failed");
            }


        } else {
            result = ("Invalid Score");

            System.out.println(result);



        }

        }


    }