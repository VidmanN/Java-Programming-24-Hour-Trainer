package com.practicaljava.unit4;

import com.practicaljava.unit4.staff.Contractor;
import com.practicaljava.unit4.staff.Employee;
import com.practicaljava.unit4.staff.Person;

/**
 * Created by Nadiya Vidman on 31.01.2017.
 */
public class TestPayIncrease {
    public static void main(String[] args) {
        Person workers[] = new Person[3];
        workers[0] = new Employee("John");
        workers[1] = new Contractor("Marina");
        workers[2] = new Employee("Steve");

        Employee currentEmployee; //создаем неинициализированную ссылку с именем currentEmployee и типом Employee
        Contractor currentContractor; //создаем неинициализированную ссылку с именем currentContractor и типом Contractor

        for (Person p: workers){ //пробегаем по всем элементам массива workers, p - текущий элемент
            if (p instanceof Employee){ //проверка на соответствие типа элемента классу Employee
                currentEmployee = (Employee) p; //приведение типа к Employee, downcasting
                currentEmployee.increasePay(30);

            }else if  (p instanceof Contractor){
                currentContractor = (Contractor) p; //приведение типа к Contractor, downcasting
                currentContractor.increasePay(30);
            }

        }
    }
}
