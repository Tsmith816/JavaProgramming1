package day06_PrimitiveTypeCastings;

public class Birthday {

    public static void main(String[] args) {
        String name = "Tyler";
        int birthDay = 16;
        String birthMonth = "August";
        int birthYear = 2002;

        System.out.println(name + " was born on " + birthMonth + "/" + birthDay + "/" + birthYear);

        System.out.println("------------------------------------------");

        String bookName = "The Rich Dad and The Poor Dad";

        System.out.println("My favorite book is \"" + bookName + "\"");


    }

}
/*
1. Create a class called BirthDay and create the following variable
             name, birthDay(int), birthMonth(String), birthYear(int)

             use concatenation to display the birthday of the person

                 if  name = "John"
                     birthDay = 25
                     birthMonth = "April"
                     birthYear = 1995;

                 output:
                     John was born on April/25/1995.

 */