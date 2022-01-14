package day09_IfStatements;

public class PosNegZero {

    public static void main(String[] args) {


        int n = 100;

        boolean positive = n>0;
        boolean negative = n<0;

        if (n>0) {
            System.out.println("Positive");
        }

        else if (n<0){
            System.out.println("Negative");
        }

        else{
            System.out.println("Zero");
        }




    }
}
