/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.other;

import sit.int675.practice.week6.Employee;

/**
 *
 * @author Student Lab
 */
public class TestPolymore {

    public static void main(String[] args) {

        Director d1 = new Director();
        Employee e1 = new Employee();
        Manager m1 = new Director();

        d1.setSaraly(9000);
        e1.setSaraly(9000);
        m1.setSaraly(9000);

        printEmployee(e1);
        printEmployee(d1);
        printEmployee(m1);
    }
    

    public static void printEmployee(Employee e) {
        System.out.println(e);
        System.out.println("Salary = " + e.getSaraly());
    }
//        Object o1 = new Director();
//        Object o2 = new Employee();
//        System.out.println(o1.toString());
//        System.out.println("\n\n===========================");
//        System.out.println(o2.toString());  
}
