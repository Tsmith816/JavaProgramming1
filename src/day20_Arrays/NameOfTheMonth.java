package day20_Arrays;

public class NameOfTheMonth {

    public static void main(String[] args) {

        String[] month = {"January", "Febuary", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"};

        /*
        System.out.println(month[0]);
        System.out.println(month[1]);
        System.out.println(month[2]);
        System.out.println(month[3]);
        System.out.println(month[4]);
        System.out.println(month[5]);
        System.out.println(month[6]);
        System.out.println(month[7]);
        System.out.println(month[8]);
        System.out.println(month[9]);
        System.out.println(month[10]);
        System.out.println(month[11]);
        */

        for (int i = 0; i< month.length; i++){ // i represents the indx numbers of the array starting from 0 to the last index
            System.out.println( month[i] );
        }

        System.out.println("-----------------------------------------------------------------------------");


        for (int i = month.length-1; i>=0; i--){
            System.out.println(month[i]);
        }






    }

}
