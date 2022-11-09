/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nombre_ordre;
import java.util.*;
/**
 *
 * @author Omar
 */
public class Nombre_ordre {
    public static void main(String args[]){
        int n=2, u, u1=2, u2=1;
        float v,v1=2,eps;
        
        Scanner clavier = new Scanner (System.in);
        System.out.println("Avec quelle precision vous voulez le nombre d'or?: ");
        eps = clavier.nextFloat();
        u=u1+u2;
        v=(float)u/u;
        
        do{
            u2=u1;
            u1=u;
            v1=v;
            n=n+1;
            u=u1+u2;
            v=(float)u/u;
            n+=1;    
        }
        while(Math.abs(v-v1)>eps);
        
        System.out.println("Le nombre d'or = " + v + " son rang est: " + n);
    }
}
