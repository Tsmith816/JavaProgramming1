package day32_Constructor;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Ford");

        Car car2 = new Car("BMW", "335i");

        Car car3 = new Car("Audi", "RS5", 2016);

        Car car4 = new Car("Mercedes", "C63AMG", 2014, 43500);

        Car car5 = new Car("Lexus", "ISF", 2012, 38500, "Blue");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

    }

}
