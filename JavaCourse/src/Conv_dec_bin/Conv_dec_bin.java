/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conv_dec_bin;
import java.util.*;

/**
 *
 * @author Omar
 */
public class Conv_dec_bin {
    public static void main(String args []){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("donnez un entier décimal: ");
        int decimalNumber = input.nextInt();
        
        int a = decimalNumber;
        int n = (int)(Math.log(a)/Math.log(2));
        String s1 = "";
        
        while(n>=0){
            if(a>=Math.pow(2,n)){
                a -= Math.pow(2, n);
                s1 += "1";
            }
            else
                s1 += "0";
                n--;
            }
        System.out.println("La conversion decimal du nombre decimal " + decimalNumber + " en binaire est: ");
        System.out.println(s1);
       
    }
}
