/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week5;

import sit.int675.demo.week4.BankAccount;

/**
 *
 * @author Student Lab
 */
public class TestMethod {

    public static void main(String[] args) {

        double x = Math.pow(2, 5);

        System.out.println(Math.pow(7, 7) * 2.0);
        System.out.println(5 * 2);
        long now = System.currentTimeMillis();
        long nowMoreAccurent = System.nanoTime();

        System.out.println("Now= " + (2015 - (now / 1000 / 60 / 60 / 24 / 356)));

        BankAccount bx = new BankAccount(10001, "Nattha", 5000);
        System.out.printf("%10d%-20s%10.2f\n" + bx.getAccountId(), bx.getName(), bx.getBalance());
        
        foo(bx);
        System.out.printf("%10d%-20s%10.2f\n" + bx.getAccountId(), bx.getName(), bx.getBalance());
        
        bar(bx);
        System.out.printf("%10d%-20s%10.2f\n" + bx.getAccountId(), bx.getName(), bx.getBalance());
        
    }

    public static void foo(BankAccount ba) {
       ba.deposit(9000);
    }
    
    public static void bar(BankAccount ba)
    {
        ba = new BankAccount();
        ba.deposit(10000);
    }
}
