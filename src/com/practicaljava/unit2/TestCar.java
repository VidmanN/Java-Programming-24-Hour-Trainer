package com.practicaljava.unit2;

/**
 * Created by Nadiya Vidman on 27.01.2017.
 */
public class TestCar {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        car1.color = "blue";
        car2.color = "red";

        System.out.println("First cars color is " + car1.color);
        System.out.println("Second cars color is " + car2.color);
    }
}
