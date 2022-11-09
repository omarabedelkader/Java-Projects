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
public class NFA0322019R {
    public static void main(String args[]){

           affiche(0,0); 
        
    }
    
    public static int affiche(int a, int i) {
        while( i<=3){
            while(a <100 ){
                System.out.print(a+" ");  
                return affiche(a+10,i);
            }
            i++;
            a=i;
            
            
            System.out.println();
            
        }
        return 0;
    }
}
