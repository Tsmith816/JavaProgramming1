package day08_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizen ="USA";

        boolean isEligible = age >= 18 && citizen == "USA";

        if (isEligible){
            System.out.println("ELigible");
        }

        if (!isEligible){
            System.out.println("Not Eligible");
        }




    }
}
