/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.other;

/**
 *
 * @author Student Lab
 */
public class Director extends Manager {

    private String car = "s500";

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCar = " + car;
        
        //
    }
}

