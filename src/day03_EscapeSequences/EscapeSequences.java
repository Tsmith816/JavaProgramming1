package day03_EscapeSequences;
/*
Escape sequences: must be given with double quote
\n: starts a new line
\t: gives a horizontal space (tab)
\\: to print a single backslash since 1 backslash expects another character to be there
\": double quote
 */
public class EscapeSequences {
    public static void main(String[] args) {

        System.out.println("Java \nPython \nC#");

        System.out.println("------------------------------------");

        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");

        System.out.println("------------------------------------");

        System.out.println("\tJava is Cool Programming Language");

        System.out.println("------------------------------------");

        System.out.println("/\\"); // in order to print backslashes you must print \\"

        System.out.println("------------------------------------");

        System.out.println("My favorite TV show is \"Game of Thrones\""); // in order to print quotation marks you must print 2 \" before and after the quote



    }

}
