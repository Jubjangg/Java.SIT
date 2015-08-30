/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.practice.week6;

/**
 *
 * @author Student Lab
 */
public class Employee {

    protected int id;
     String name;
    private double saraly;

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.id = 100;
        e1.name = "Somchai";  
        e1.saraly = 53000;

        e2.id = 100;
        e2.name = "Somchai";
        e2.saraly = 53000;

        System.out.println(e1.equals(e2));
        System.out.println(e1.toString());
        System.out.println(e2);
        
    }

    @Override
    public String toString() {
        return "ID: "+ id +",Name: "+ name +",Salary: "+getSaraly();
       
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSaraly() {
        return saraly;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSaraly(double saraly) {
        this.saraly = saraly;
    }


    
    
}
