/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo.week3;

import java.util.Scanner;

/**
 *
 * @author Student Lab
 */
public class TestSwitch {

    public static void main(String[] srgs) {
        Scanner sc = new Scanner(System.in);

        String day = null;
        do {
            System.out.println("Please enter ");
            day = sc.next();
            String color = null;
            switch (day) {
                case "Monday":
                case "monday":
                case "MONDAY":
                case "MON":
                    color = "Yellow";
                    break;

                case "Tuesday":
                    color = "Pink";

                case "Wed":
                    color = "Green";

                case "Thu":
                    color = "Orange";

                case "Fri":
                    color = "Blue";

                case "Sat":
                    color = "Violet";
                default:
                    color = "Invalid day";

                    break;
            }
            System.out.println("Days: " + day + ",Color" + color);

        } while (!day.equalsIgnoreCase("stop"));
    }
}
