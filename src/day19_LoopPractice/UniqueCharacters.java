package day19_LoopPractice;

public class UniqueCharacters {

    public static void main(String[] args) {

     String str = "aabccdeef";
     String result = "";

     char ch = 'a';
     int count = 0; //represents frequency of the ch
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);// each character of str
            if (ch == each){
                count++;
            }

        }

        if (count != 1){

        }

        System.out.println(count);





















    }
}
