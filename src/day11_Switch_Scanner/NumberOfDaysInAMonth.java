package day11_Switch_Scanner;

public class NumberOfDaysInAMonth {

    public static void main(String[] args) {
        int year = 2000;
        int number = 12;

        String result = "";

        if (number >= 1 && number <= 12){
            switch (number) {

                case 2:
                    if (year % 4 == 0){
                        result = "29 Days";
                    }else {
                        result = "28 Days";
                    }
                    break;

                case 4: case 6: case 9: case 11:
                    result = "30 Days";
                    break;

                default: //1, 3, 5, 7, 8, 10, 12
                    result = "31 Days";



            }

        }else{
             result = "Invalid Number";
        }

        System.out.println(result);



    }
}
