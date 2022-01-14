package day14_String;

public class StringMethod2 {

    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python");

        System.out.println("str = "+ str);
        System.out.println("str2 = " + str2);


        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo", "gmail");

        System.out.println("email = " + email);

        String sentance = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String sentance2 = sentance.replace("Python", "");
        System.out.println("sentance2 = " + sentance2);

        String s = "Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat");
        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";
        s2 = s2.replace("C#", " Java");
        System.out.println("s2 = " + s2);


        String result = "Java Java Java";
        result = result.replace("Java", "Python");
        //result = result.replaceFirst("Java", "Python");
        System.out.println(result);

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java");
        System.out.println(result2);

        String result3 = "Java";
        result3 = result3.replaceFirst("a", "o");
        System.out.println(result3);

        String result4 = "Java";
        result4 = result4.replaceFirst("va", "vo");
        System.out.println(result4);



    }
}
