/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd_week_09;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author Ali tariq
 */
public class Task1 {

//    MAIN FUNCTION

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String sub = "the";
        String input = JOptionPane.showInputDialog("Enter the String");

        if (findSubString(input, sub)) {

            JOptionPane.showMessageDialog(null, "Number of words: " + wordCounter(input) + "\n"
                    + "Number of vowels: " + vowelCounter(input) + "\n"
                    + "Number of punctuations: " + puncCounter(input) + "\n"
                    + "\\\"the\\\" is a part of this string");
        } else {
            JOptionPane.showMessageDialog(null, "Number of words: " + wordCounter(input) + "\n"
                    + "Number of vowels: " + vowelCounter(input) + "\n"
                    + "Number of punctuations: " + puncCounter(input) + "\n"
                    + "\\\"the\\\" is not a part of this string"
            );
        }
    }
// =====================================Word Counter===============================

    /**
     *
     * @param s
     * @return
     */
    public static int wordCounter(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }

        }
//   System.out.println(count + 1);
        return count + 1;
    }
//================================VOWEL COUNTER==================================

    /**
     *
     * @param s
     * @return
     */
    public static int vowelCounter(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
                    || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                count++;
            }

        }
//   System.out.println(count);
        return count;
    }
//    Punctuations Counter======================================================

    /**
     *
     * @param s
     * @return
     */
    public static int puncCounter(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '!' || s.charAt(i) == '.' || s.charAt(i) == '-' || s.charAt(i) == '"' || s.charAt(i) == '?'
                    || s.charAt(i) == ';' || s.charAt(i) == '\'' || s.charAt(i) == ',' || s.charAt(i) == ':' || s.charAt(i) == '(' || s.charAt(i) == '/'
                    || s.charAt(i) == ')') {
                count++;
            }

        }
//   System.out.println(count);
        return count;
    }
//================================Checking substring============================
    
    /**
     *
     * @param s
     * @param sub
     * @return
     */
    public static boolean findSubString(String s, String sub) {

        char check1;
        char check2;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            check1 = s.charAt(i);
            for (int j = 0; i < sub.length(); i++) {
                check2 = sub.charAt(i);
                if (check1 == check2) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }
        return flag;
    }

}
