package day23_CustomMethods;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        oddOrEven(10); // method demands additional info to complete its task
        ageOfPerson(2002);

    }

    //create a function that can check if a number is odd or even
    public static void oddOrEven(int number){

        if (number % 2 == 0){
            System.out.println(number +" is an even number");
        }else{
            System.out.println(number +" is an odd number");
        }

    }


    //create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){

        int age = 2021 - birthYear;

        System.out.println("Your age is: " + age);

    }

    //create a function that can print all the numbers between X and Y
    public static void printNUmbers(int x, int y){
        
    }



}
