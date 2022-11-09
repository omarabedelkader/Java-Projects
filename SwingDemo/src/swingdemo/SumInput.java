/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingdemo;

import javax.swing.JOptionPane;

/**
 *
 * @author Omar
 */
public class SumInput{
    
    

    public static void main(String args[]){
        String num1 = JOptionPane.showInputDialog("Enter first number");
        String num2 = JOptionPane.showInputDialog("Enter second number");
        
        int int1 = Integer.parseInt(num1);
        int int2 = Integer.parseInt(num2);
        int sum = int1 + int2;
        JOptionPane.showMessageDialog(null,"the sum of the numbers is " + sum, "sum of 2 numbers", JOptionPane.PLAIN_MESSAGE);
    }
}
