package day20_Arrays;

import java.util.Arrays;

public class day20_ArraysIntro{

    public static void main(String[] args) {

        String[] myGroup = new String[5];
        myGroup[0] = "Guany";
        myGroup[1] = "Niera";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";

        System.out.println(Arrays.toString(myGroup));


        System.out.println("---------------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));

        int number = 5;

        if (number <1 || number >7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number-1]);




    }

}
