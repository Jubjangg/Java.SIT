/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo.week3;

/**
 *
 * @author Student Lab
 */
public class TestWhite {

    public static void main(String[] srgs) {
        int i = 1;
        while (i < 100) {
            System.out.print(i + (i % 6 == 0 ? "\n" : "\t"));
            i++;
        }
        System.out.println("\n---------------------------------\n");
        int count = 1;
        do {
            System.out.print(i+(count%8==0? "\n":"\t"));
            count++;
            i--;
        }while(i>0);
    }
}
