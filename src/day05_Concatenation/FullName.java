package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Aaron";
        String lastName = "Daniel";
        String fullname = firstName + " " + lastName;
        int age = 19;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        System.out.println("Full name of the person is " + fullname );
        System.out.println(fullname + " is " + age );
        System.out.println(fullname + " is " + jobTitle + ", works at " + companyName + ", and " + fullname + "'s salary is " + salary);


    }

}
