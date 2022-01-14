package day03_EscapeSequences; // this is the package name

public class Println_VS_Print2 {  // this is name of this class

    public static void main(String[] args) { // this is main method

        System.out.println("Knock Knock"); // first it prints knock knock, then it appends a new line
        System.out.println("Who is this");

        System.out.println("This is Java");

        System.out.println("---------------------");

        System.out.print("Knock Knock"); // first it prints knock knock, then it doesn't append a new line
        System.out.print("Who is this?");
        System.out.print("This is Java");
        System.out.println();
        System.out.println("----------------------");

        System.out.println("Hello everyone. How are you all today? Today we will learn Escape Sequences, and next week we will learn Variables");

        System.out.println("------------------------");

        System.out.print("Hello everyone, how are you all today?");
        System.out.print("Today we will learn Escape Sequences");
        System.out.print(", and next week we will learn Variables");


    }

}

//to make single line commands use //
// to make multi-line commands use:/* and close with */

//Example: This is a single line command
/* this is a multi line command
I like pizza
 */

 /*
        topics:
        println method
        print method
        comments
         */