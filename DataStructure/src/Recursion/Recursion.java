/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

public class Recursion {
    


    public static void main (String [] args){

            pair(0);
    }


public static void descending (int n){

   if(n>0){
        System.out.println(n);
        descending(--n);
    }
}

public static void ascending (int i){

   if(i>10)
       return;
    System.out.println(i);
    ascending(++i);
   
}

public static void pair (int i){
    if (i > 64)
        return;
    System.out.println(i);
    pair (2+i);
              
}

}
    
    
    