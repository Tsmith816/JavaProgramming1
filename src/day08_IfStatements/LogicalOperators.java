package day08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {

        String name = "Dave";
        int age = 18;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";

        System.out.println(name + " is eligible to vote: " + isEligible);

        String name2 = "Josh";

        int creditScore = 720;
        int age2 = 23;
        int ioncome = 40000;

        boolean iseligible2 = creditScore >= 700 && age2 >=21 && ioncome >= 60000;

        System.out.println(name2 + " is eligible for loan: " + iseligible2);

        System.out.println("----------------------------------------------");

        String name3 = "Josh";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');

        System.out.println(name3 + " is eligible to register: " + isEligible3);

        System.out.println("----------------------------------------------");

        String student = "Anna";

        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligible4 = gpa >= 3.5 || familyIncome <= 60000;

        System.out.println("Student is eligible: " + isEligible4);
    }
}
