package day017_WhileDoWhile;

public class FrequencyOfCharacter {

    public static void main(String[] args) {
        
        String str = "AAABBBC";

        char ch = 'A';
        
        int frequency = 0;

        for (int i = 0; i < str.length() ; i++) { // i: indexes of str
            char eachChar = str.charAt(i); //eachChar: each character of str

            if (ch == eachChar){ // if given char matches with the eachChar then ch appears in the string
                frequency++;
            }
        }
        System.out.println(frequency);

        System.out.println("--------------------------------------");


    }
}
