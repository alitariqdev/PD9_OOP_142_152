/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd_week_09;

import javax.swing.JOptionPane;

/**
 *
 * @author Hamad DEVIL
 */
public class Task4 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter the String");

        JOptionPane.showMessageDialog(null, "Number of Up case Letters: " + noOfUpCaseLetters(input) + "\n"
                + "Number of Lower case Letters: " + noOfLowerCaseLetters(input) + "\n");

    }

    /**
     * This function returns the number of all up case letters in the string.
     *
     * @param s is a string which is passed to the function.
     * @return count variable
     */
    public static int noOfUpCaseLetters(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                count++;
            }
        }

        return count;
    }

    /**
     * This function returns the number of all lower case letters in the string.
     *
     * @param s is a string which is passed to the function.
     * @return count variable.
     */
    public static int noOfLowerCaseLetters(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                count++;
            }
        }

        return count;
    }
}
