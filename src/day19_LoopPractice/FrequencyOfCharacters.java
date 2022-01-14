package day19_LoopPractice;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aabccd";
        String result = ""; //a2b1c3d1

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(0); //'a'
            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i); // each character of str
                if (ch == each){
                    count++;

                }
            }

            result += ch;
            result += count;

        }



        char ch = str.charAt(0); //'a'
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i); // each character of str
            if (ch == each){
                count++;

            }
        }




        System.out.println(result);

    }

}
