package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("BMW", "335i", "White", 2011, 12000);
        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("Kia", "Forte", "White", 2010, 5000);
        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Ford", "Ecoboost Mustang","White", 2016, 18500);
        System.out.println(car3);

        Car car4 = new Car();
        car4.setInfo("Audi", "S4", "Black", 2015, 35000);
        System.out.println(car4);

        Car car5 = new Car();
        car5.setInfo("Mercedes", "C63AMG", "Black", 2014, 40000);
        System.out.println(car5);

        //Car[] cars = {car1, car2, car3, car4, car5};

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3,car4,car5));

        for (Car each : carsList){
            System.out.println(each.brand+" "+each.price);
        }

        System.out.println("-----------------------------------------------------------");

        carsList.removeIf( p -> p.brand.equals("BMW") && p.year >=2005 && p.year <=2008 );
        carsList.removeIf( p -> p.brand.equals("Toyota") && p.year >=1995 && p.year <= 1997 );


    }

}
