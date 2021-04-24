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
public class Task3 {
    public static void main(String args[]){
        String s=" ";
      s=JOptionPane.showInputDialog(null,"\tREMOVE EXTRA BLANKS\n"+"Input String :");
      String output= ridMultipleBlank(s);
      JOptionPane.showMessageDialog(null,output);
      s=JOptionPane.showInputDialog(null,"\tREMOVE INTEGERS\n"+"Input String :");
          output= removeInteger(s);
      JOptionPane.showMessageDialog(null,output);
      
    }
    //*********************************ridMultipleBlankRemover******************************
    
     /**
     * Remove extra spaces from the String
     * @param s
     * @return s
     */
    public static String ridMultipleBlank(String s){
       for(int i= 0 ; i< s.length();i++)
       {
           //JOptionPane.showMessageDialog(null,"check 1");
           if(s.charAt(i)==' '&& s.charAt(i+1)==' ')
           {
               
             s = s.replace("  ", " ");
        
           }
            
       }
    return s;
}
    //*********************************REMOVE INTEGER******************************
    
     /**
     * Remove Integer from the String
     * @param s
     * @return s
     */
    public static String removeInteger(String s){
        for(int i=0;i< s.length();i++){
        s = s.replace("0", "");
        s = s.replace("1", "");
        s = s.replace("2", "");
        s = s.replace("3", "");
        s = s.replace("4", "");
        s = s.replace("5", "");
        s = s.replace("6", "");
        s = s.replace("7", "");
        s = s.replace("8", "");
        s = s.replace("9", "");
        
        }
        return s;
    }
    
}


 