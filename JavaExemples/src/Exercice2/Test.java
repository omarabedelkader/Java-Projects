/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice2;

import Exercice2.Consommation.DateConsommationExcept;

/**
 *
 * @author Omar
 */
public class Test {
    public static void main(String args[]){
        Abonne a1 = new Abonne(1, "Anthony", "Ashrafieh");
        Abonne a2 = new Abonne(2, "Emile", "Fanar");
        Ligne l1 = new Fixe(1, a1, "local1");
        Ligne l2 = new Mobile(2, a2, "local2");
        Service s1 = new Internet(1, "desc1", 100.0, "isp");
        Service s2 = new Appel(2, "desc2", 200.0);
        Consommation c1 = null, c2 = null, c3 = null, c4 = null;
        
        try{
                c1 = new Consommation(l1,s1,10,1918,120);
                c2 = new Consommation(l1,s2,11,1918,200);
                c3 = new Consommation(l2,s1,8,1918,130);
                c4 = new Consommation(l2,s2,12,1918,300);
            } catch (DateConsommationExcept e){
                System.out.println(e.getMessage());
                System.exit(0);
            }
        
            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c3);
            System.out.println(c4);
        
    }
    
    
}
