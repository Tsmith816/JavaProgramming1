package day07_Operators;

import javax.management.MBeanException;

public class RelationalOperators {

    public static void main(String[] args) {
        // >, >=, <, <=

        boolean results1 = 200 > 40;

        System.out.println("results1 = " + results1);

        boolean result2 = 300 >= 150;

        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100;

        System.out.println("result3 = " + result3);

        boolean result4 = 300 >= 500;

        System.out.println("result4 = " + result4);

        int creditScore = 745;

        boolean isEligibleForLoan = creditScore >= 720;

        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        boolean result5 = 100 < 120;
        System.out.println("result5 = " + result5);

        boolean result6 = 200< 180;
        System.out.println("result6 = " + result6);

        int score = 75;
        boolean hasFailed = score <= 59;

        System.out.println("hasFailed = " + hasFailed);

        boolean result7 = 45 <= 60;
        System.out.println("result7 = " + result7);

        System.out.println("-----------------------------------------");

        int x = 100;
        int y = 200;

        boolean equal = x==y;

        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar" == "Good Guy";
        System.out.println("result8 = " + result8);

        boolean result9 = 'A' == 'a';
        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java";
        System.out.println("result10 = " + result10);

        System.out.println("-----------------------------------------");

        boolean result11 = 100 != 200.5;
        System.out.println("result11 = " + result11);

        boolean result12 = "Java" != "Break";
        System.out.println("result12 = " + result12);
    }
}
