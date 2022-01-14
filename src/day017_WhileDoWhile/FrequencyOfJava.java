package day017_WhileDoWhile;

public class FrequencyOfJava {

    public static void main(String[] args) {

        String str = "JavaJavaJavaJavaJavaJava";

        int frequency = 0;

        for (int i = 0; i < str.length()-3; i++) {
            String eachsub = str.substring(i,i+4);
            //System.out.println(eachsub);

            if (eachsub.equals("Java")){
                frequency++;
            }

        }

        System.out.println(frequency);




    }
}
