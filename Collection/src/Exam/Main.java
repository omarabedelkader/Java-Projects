/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

import java.util.ArrayList;

/**
 *
 * @author Anthony
 */
public class Main {
    public static void main(String args[]){
        Produit p1 = new Produit("a",10.0);
        Produit p2 = new Produit("b",11.0);
        Produit p3 = new Produit("c",12.0);
        Produit p4 = new Produit("d",13.0);
        
        Produit p5 = new Produit("e",14.0);
        Produit p6 = new Produit("f",15.0);
        Produit p7 = new Produit("g",16.0);
        Produit p8 = new Produit("h",17.0);
        
        ArrayList <Produit> l1 = new ArrayList<Produit>();
        ArrayList <Produit> l2 = new ArrayList<Produit>();
        
        l1.add(p1);
        l1.add(p2);
        l1.add(p3);
        l1.add(p4);
        
        l2.add(p5);
        l2.add(p1);
        l2.add(p7);
        l2.add(p1);
        
        Exam e = new Exam();
        
        System.out.println(e.union(l1, l2));
        
        
        
    }
}
