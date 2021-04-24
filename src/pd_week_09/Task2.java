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
        String output = displayVertical(input);

    }

    /**
     *
     * @return @param s
     */
    public static String displayVertical(String s) {
        String check = "";
        System.out.println("Your scentence printed vertically is: ");
        for (int i = 0; i < s.length(); i++) {

            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                    || s.charAt(i) == '!' || s.charAt(i) == '.'
                    || s.charAt(i) == '-' || s.charAt(i) == '"' || s.charAt(i) == '?'
                    || s.charAt(i) == ';' || s.charAt(i) == '\'' || s.charAt(i) == ','
                    || s.charAt(i) == ':' || s.charAt(i) == '(' || s.charAt(i) == '/'
                    || s.charAt(i) == ')') {
                System.out.println(s.charAt(i));
                check = s;
            }

        }
        return check;
    }

}
