/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EquationDuSecondDegre;
import java.util.*;
/**
 *
 * @author Omar
 */
public class EquationduSecondDegre {
    public static void main(String args[]){
        int a,b,c;
        double x1,x2,x0;
        double delta;
        
        Scanner clavier = new Scanner(System.in);
        
        System.out.println("Donnez la valeur de a:");
        a = clavier.nextInt();
        
        System.out.println("Donnez la valeur de b:");
        b = clavier.nextInt();
        
        System.out.println("Donnez la valeur de c:");
        c = clavier.nextInt();
        
        delta = (Math.pow(-b, 2)) - 4 * a *c; 
        
        if(delta>0){
            x1=(-b+Math.sqrt(delta))/2*a;
            x2=(-b-Math.sqrt(delta))/2*a;
            System.out.println("x1 = " + x1 + ", x2= " + x2);
        }else if(delta==0){
            x0=(-b)/(2*a);
            System.out.println("x0 = " + x0);
        }
        else{
            System.out.println("L'equation ne possede aucune solution.");
        }
    }
}
