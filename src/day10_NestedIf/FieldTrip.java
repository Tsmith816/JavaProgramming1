package day10_NestedIf;

public class FieldTrip {

    public static void main(String[] args) {
        int grade = 2;
        String location = "";
        int group_number = 0;
        String teacher = "";

        if (grade >=1 && grade <=6){

        if (grade == 1){
            location = "Apple Orchard";
            group_number = 3;
            teacher = "Ms. Smith";
        }else if (grade == 2){
            location = "Zoo";
            group_number = 7;
            teacher = "Mr. Lee";
        }else if (grade == 3){
            location = "Aquarium";
            group_number = 5;
            teacher = "Ms. Wilson";
        }


        }else{
            System.out.println("Invalid Grade");
        }


        System.out.println("location - "+location+" \nnumber of groups - "+group_number);
        System.out.println("number of groups - "+group_number);
        System.out.println("teacher in charge - "+teacher);



    }
}
