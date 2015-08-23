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
public class CountArray {

    private String sentence;
    private int count[] = new int[26];

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public int[] getCount() {
        return count;
    }

    public void count() {
        for (int i = 0; i < sentence.length(); i++) {
            char x = sentence.charAt(i);

            if (x >= 65 && x <= 65 + 25) {
                count[x - 65]++;

            }

        }

    }

    public String getResult(int itemPerLine) {
        int x = 1;
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {

                tmp.append((char) (i + 65) + ": " + count[i]);
                tmp.append(x % itemPerLine == 0 ? "\n" : ",\t ");
                x = x + 1;
            }

            if ((x - 1) % itemPerLine != 0) {
                tmp.delete(tmp.length() - 2, tmp.length() - 1);
            }
        }
        return tmp.toString();
    }

    public static void main(String[] sargs) {
        CountArray cl = new CountArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Sentence: ");
        String str = sc.nextLine().toUpperCase();
        cl.setSentence(str);
        cl.count();
        System.out.println(cl.getResult(5));
        
        cl.setSentence("NHOISGSGNOJBVGSGdgjpbojrpehrhnmjreokhbre");
        cl.count();
        System.out.println(cl.getResult(10));
    }
}

//public static void main(string[]srgs)
//            Scanner sentence = new Scanner(System.in);
//            System.out.print("Enter any Sentence: ");
//            String str = sentence.nextLine().toUpperCase();
//
//            int ch[] = new int[26];
//            for (int i = 0; i < str.length(); i++) {
//                char x = str.charAt(i);
//
//                if (x >= 65 && x <= 65 + 25) {
//                    ch[x - 65]++;
//                }
//            }
//            for (int i = 0; i < ch.length; i++) {
//                if (ch[i] > 0) {
//                    System.out.println((char) (i + 65) + ": " + ch[i]);
//                }

