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
      s=JOptionPane.showInputDialog("Input String :");
      String output= ridMultipleBlank(s);
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
               
             s = s.replace("  ", "");
        
           }
            
       }
    return s;
}
}


 