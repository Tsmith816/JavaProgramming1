package day31_Constructors.scrumTask;

public class ScumTeam {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Layan",11,"QA",110000);
        Tester tester2 = new Tester("Ali",43,"SDET",142000);
        Tester tester3 = new Tester("Alex",44,"SE",135000);
        Tester tester4 = new Tester("Lala",23,"SDET",115000);

        Tester[] testers = {tester2,tester3,tester4};


        //4 developers objects
        Developer developer1 = new Developer("Olga",22,"Java Developer",125000);
        Developer developer2 = new Developer("Aygun",39,"Java Master",185000);
        Developer developer3 = new Developer("Tunc",28,"Software Developer",135000);
        Developer developer4 = new Developer("Sinuem",13,"JSenior Developer",200000);

        Developer[] developers = {developer2,developer3,developer4};



    }

}







