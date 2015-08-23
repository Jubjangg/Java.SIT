/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo.week4;

/**
 *
 * @author Student Lab
 */
public class TestBankAccount {
    
    public static void main(String[]srgs)
    {
        BankAccount ba = new BankAccount();
        BankAccount bb = new BankAccount(10009,"Nattha",9500.01);
        
        System.out.println("bc = "+bb);
        
        ba.deposit(500);
        ba.setAccountId(9100);
        ba.setName("Nattha");
        
        
        bb.deposit(900);
        
        
        
        
    }
    
}
