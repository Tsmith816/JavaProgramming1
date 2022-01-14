package day23_CustomMethods;

public class MethodPractice2 {
    public static void main(String[] args) {

        helloWorld5Times();
        helloCydeo5Times();
        booWopSoup5Times();
        evenNumbers();

    }

    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

    }

    public static void helloCydeo5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }

    }

    public static void booWopSoup5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Boo Wop Soup");
        }

    }

    public static void evenNumbers(){

        for (int i = 2; i < 11; i+=2) {
            System.out.println(i);
        }

    }












}
