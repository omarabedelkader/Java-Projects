/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversion_To_Octal;
import java.util.*;
/**
 *
 * @author Omar
 */
public class Conversion_To_Octal {
    public static void main(String args []){
        Scanner clavier = new Scanner(System.in);
        
        System.out.print("Donnez un entier decimal: ");
        int decimalNumber = clavier.nextInt();
        int a = decimalNumber;
        int n = (int)(Math.log(a)/Math.log(8));
        System.out.print("n= " + n);
        int [] octalNumber = new int [n+1];
        int i=0;
        
        while(n>=0){
            if(a>=Math.pow(8, n)){
                int q = (int)(a/Math.pow(8, n));
                octalNumber[i] = q;
                a-=q*(Math.pow(8, n));
            }
            else
                octalNumber[i]=0;
            n--;
            i++;
        }    
        
        System.out.println();
        System.out.println("La Conversion de nombre decimal " + decimalNumber + " en nombre octal est: ");
        for(int k=0; k<octalNumber.length; k++)
            System.out.print(octalNumber[k]);
        
    }
}
