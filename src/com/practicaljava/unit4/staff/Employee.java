package com.practicaljava.unit4.staff;

/**
 * Created by Nadiya Vidman on 31.01.2017.
 */
public class Employee extends Person implements Payable{
    public Employee(String name){
        super(name);
    }

    @Override
    public boolean increasePay(int percent) {
        System.out.println("Increasing salary by " + percent + "%." + getName());
        return true;
    }
}
