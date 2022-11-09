
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

/**
 *
 * @author Omar
 */
public class FloconDeVonKoch {
    
    static int nbSegments (int n){
        if(n==0)
         return 3;
        return 4*nbSegments(n-1);
    }
    
    public static void main(String args[]){
        System.out.println(nbSegments(2));
    }
}
