package day36.encapsulation;

public class Main {
    public static void main(String[] args) {
        Cars cars = new Cars("Mercedes");

        System.out.println(cars.getCarName());   // using getter method.

        cars.setCarName("Toyota");    // this is using setter method
        System.out.println(cars.getCarName());

       //cars.carName = " BMW";    // this is creating object and it is not working here, first we are creating setter method.

        System.out.println(cars.toString());   // this is toString that brings all information of cars class.
















    }
}
