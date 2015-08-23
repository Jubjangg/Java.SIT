/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week5;

/**
 *
 * @author Student Lab
 */
public class TestStatic {

    public static int count = 0;
    public int x = 1;

    public static void main(String[] args) {

        java.sql.Date d1 = new java.sql.Date(System.currentTimeMillis());
        java.util.Date d2 = new java.util.Date();

        System.out.println(d1);
        System.out.println(d2);

        System.out.println("count=" + count);

        TestStatic ts1 = new TestStatic();
        TestStatic ts2 = new TestStatic();
        ts2.x = 9;
        ts1.count = 900;

        System.out.println("ts1.x=" + ts1.x);
  
        System.out.println("ts2.x=" + ts2.x);

        System.out.println("count" + TestStatic.count);

        for (int i = 0; i < 10; i++) {
            new DemoStatic();
        }
        DemoStatic ds = new DemoStatic();
        System.out.println("Number of instant (object) of DemoStatic= " + ds.getCountInstant());

        System.out.println("PI=" + 22.0 / 7.0);
        System.out.println("PI=" + 22.0 / 7.0);
    }
}

class DemoStatic {

    private static int countInstant = 0;

    public DemoStatic() {
        countInstant++;

    }

    public int getCountInstant() {

        return countInstant;
    }
}
