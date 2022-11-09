/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Omar
 */
public class Recursion {
    public static int recursive(int n){
        if(n>=1)
            n = n * recursive(n-1);
        else
            n = 1;
        return n;
    }
    
    public static void main(String args[]){
        
        System.out.println(recursive(6));
    }
}
