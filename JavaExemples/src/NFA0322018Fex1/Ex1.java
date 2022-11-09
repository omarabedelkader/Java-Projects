/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NFA0322018Fex1;

/**
 *
 * @author Omar
 */
public class Ex1 {
    
    public static void main(String args[]){
        System.out.println(nbSegment(10));
    }
    
    public static double nbSegment(double n){
        if(n==0)
            return 3;
        return 4*nbSegment(n-1);
    }
    

}
