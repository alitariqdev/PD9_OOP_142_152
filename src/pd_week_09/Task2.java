/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd_week_09;

import javax.swing.JOptionPane;

/**
 *
 * @author Ali tariq
 */
public class Task2 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Please Enter a scentence: ");
        displayVertical(input);

    }

    /**
     *
     * @param s
     */
    public static void displayVertical(String s) {
        System.out.println("Your scentence printed vertically is: ");

        for (int i = 0; i < s.length(); i++) {
            
            System.out.println(s.charAt(i));
        }

    }

}
