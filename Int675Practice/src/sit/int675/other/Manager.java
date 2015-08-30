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
import sit.int675.practice.week6.Employee;
import java.text.DecimalFormat;
/**
 *
 * @author MemeG
 */
public class Manager extends Employee{
    private final static double BONUS_RATE = 0.09;
    public double getBonus(){
     return getSaraly()* BONUS_RATE;
    }
    
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###,###.00");
        Manager m = new Manager();
        m.id=90;
        //m.setId(190001);
        //m.setName("Choowong");
        m.setSaraly(1_000_000_000);
        String x = df.format(m.getBonus());
        System.out.printf("%s,bonus: %s baht\n",m.getName(),x);
    }
}
