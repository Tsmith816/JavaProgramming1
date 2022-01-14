package day04_Variables;

public class PrimitivesInto {

    public static void main(String[] args) {

        // age: 19 years old
        byte age = 19;

        // weight: 150 pounds
        short weight = 150;

        // salary: $100000
        // short salary = 100000 // 100000 is out of short range
        int salary = 100_000;

        long asset = 3_333_333_333L;

        //tax: 0.26
        float tax = 0.26F;

        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

        // boolean can only be used for true or false statements
        boolean isemployeed = true;
        boolean isMarried = false;

        boolean result = 100 > 300;

        System.out.println("isemployeed = " + isemployeed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";

        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);

    }


}
