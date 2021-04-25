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
public class MyString {

    private String str = null;

    public MyString(String str) {
        this.str = str;
    }

    public String toString() {
        return str;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter the String");
        MyString ms = new MyString(input);
        JOptionPane.showMessageDialog(null, "Number of Up case Letters: " + ms.noOfUpCaseLetters() + "\n"
                + "Number of Lower case Letters: " + ms.noOfLowerCaseLetters() + "\n");

    }

    /**
     * This function returns the number of all up case letters in the string.
     *
     * @return count variable
     */
    public int noOfUpCaseLetters() {

        int count = 0;
        for (int i = 0; i < this.str.length(); i++) {
            if (this.str.charAt(i) >= 'A' && this.str.charAt(i) <= 'Z') {
                count++;
            }
        }

        return count;
    }

    /**
     * This function returns the number of all lower case letters in the string.
     *
     * @return count variable.
     */
    public int noOfLowerCaseLetters() {

        int count = 0;
        for (int i = 0; i < this.str.length(); i++) {
            if (this.str.charAt(i) >= 'a' && this.str.charAt(i) <= 'z') {
                count++;
            }
        }

        return count;
    }

    /**
     * This function returns the First index of searching Char.
     *
     * @param c is character that has been searched for index
     * @return index variable.
     */
    public int getFirstIndexOfLetter(char c) {

        int index = 0;
        for (int i = 0; i < this.str.length(); i++) {
            if (this.str.charAt(i) == c) {
                index = i;
                break;
            }
        }

        return index;
    }

    /**
     * This function returns the Letter of given position.
     *
     * @param position is Integer that has been searched for Character
     * @return letter variable.
     */
    public char getLetterOfPosition(int position) {
        char letter;
        letter = '\t';
        if (position <= this.str.length()) {

            letter = this.str.charAt(position);

        }
        return letter;
    }

    /**
     * This function returns the Last index of searching Char.
     *
     * @param c is character that has been searched for index
     * @return index variable.
     */
    public int getLastIndexOfLetter(char c) {

        int index = 0;
        for (int i = 0; i < this.str.length(); i++) {
            if (this.str.charAt(i) == c) {
                index = i;

            }
        }

        return index;
    }
}
