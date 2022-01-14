package day24_CustomMethod_Return;

import org.w3c.dom.ls.LSOutput;

public class MorningTasks {

    public static void main(String[] args) {

    initials("Tyler", "Smith");
    domain("ctctsmith@gmail.com");
    nameOfMonth(12);

    }

   public static void initials(String firstName, String lastName){
        String initial = firstName.charAt(0)+"."+lastName.charAt(0);
        initial = initial.toUpperCase();
       System.out.println("initial = "+ initial);
   }

   public static void domain(String email){

        String domain = email.substring( email.indexOf("@")+1, email.lastIndexOf(".")  );
       System.out.println("domain = "+domain);
   }

   public static void nameOfMonth(int number){

        String name = "";

        if (number >= 1 && number <=12){

            name = (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr"
                    :(number==5)?"May" :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug"
                    :(number==9)?"Sep" :(number==10)?"Oct" :(number==11)?"Nov" :(number==12)?"Dec" : "Invalid";



        }else{
            name = "Invalid";
        }

       System.out.println("Month name = "+name);

   }

   public static void nameOfDay(int number){

   }

   public static void daysOfMonth(int number){

   }











}
