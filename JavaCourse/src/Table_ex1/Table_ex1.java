/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table_ex1;

/**
 *
 * @author Omar
 */
public class Table_ex1 {
    public static void main(String args []){
     
        int [] t = new int [5];
        char [] t1 = new char [7];
        
        for(int i=0; i<=t.length-1; i++){
            t [i] = 3*i-1;
            System.out.print(t[i] + " ");
        }
        
        System.out.println(" ");
        
        for(int i=0; i<=t1.length-1; i++){
            t1 [i] = (char) ('a'+i);
            System.out.print(t1[i] + " ");
        }
            
    }
    
}
