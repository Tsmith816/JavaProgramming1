package day30_CustomClass;

public class Employee {

    public String name;
    public int ID;
    public char gender;
    public String jonTitle;
    public double salary;
    public boolean isFullTime;

    public void setInfo(String name, char gender, int age, int ID, String jonTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.jonTitle = jonTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;

    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", gender=" + gender +
                ", jonTitle='" + jonTitle + '\'' +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work(){
        System.out.println(jonTitle+" "+name+" is working");
    }



}
