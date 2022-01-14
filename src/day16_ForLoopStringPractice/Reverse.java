package day16_ForLoopStringPractice;

public class Reverse {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        String result = ""; // contain the reverse version of str

        for (int i = 11; i >= 0; i--){
          result += str.charAt(i);
        }


        /*
        result += str.charAt(11);//n
        result += str.charAt(10);//o
        result += str.charAt(9);//o
        result += str.charAt(8);//p
        result += str.charAt(7);//S
        */








        System.out.println(result);


    }
}
