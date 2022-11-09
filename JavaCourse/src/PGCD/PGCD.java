/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PGCD;
import java.util.Scanner;
/**
 *
 * @author Omar
 */
public class PGCD {
    public static void main(String args []){
        
        Scanner input = new Scanner(System.in);
        
        /*Entre 2 numbers*/
        System.out.println("premier nombre:");
        int x = input.nextInt();
        System.out.println("deuxième nombre:");        
        int y = input.nextInt();
        
        int xCount = 0;
        int yCount = 0;
        
        for(int a=1; a<=x; a++){
            if(x%a==0){
               xCount ++;
            }
        }
        
        for(int b=1; b<=y; b++){
            if(y%b==0){
               yCount ++;
            }
        }
        
        /*create 2 arrays that contains diviseurs*/
        int xDiv [] = new int [xCount];
        int yDiv [] = new int [yCount];
        
        int e = 0;
        int f = 0;
        
        for(int a=1; a<=x; a++){
            if(x%a==0){
               xDiv[e]=a;
               e++;
            }
        }
        
        for(int b=1; b<=y; b++){
            if(y%b==0){
               yDiv[f]=b;
               f++;
            }
        }
        
        int max=0;
        
        for(int i=0; i<xCount; i++){
            for(int j=0; j<yCount; j++){
                if(xDiv[i] == yDiv[j]){
                    if(xDiv[i]>max){
                    max = xDiv[i];
                    }
                }
            }
        }
        
        /*Result*/
        System.out.println("Quel est le PGCD de ces deux nombres?");
        int p = input.nextInt();
        
        if(p==max)
            System.out.println("Vrai!"); 
        else
            System.out.println("Faux le PGCD est: " + max);
    }
}
