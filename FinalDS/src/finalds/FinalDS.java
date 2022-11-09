/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalds;


import java.util.Scanner;


public class FinalDS {
    
         public static void main(String[] args) 
    {
        
        Scanner str = new Scanner(System.in);
        System.out.println("enter a string:");
        String string= str.nextLine();        
                
       for (int i=string.length()-1 ; i>=0 ; i--){  
        char c = string.charAt(i);  
        System.out.println(c);  
        }   
    }
}
    
    

