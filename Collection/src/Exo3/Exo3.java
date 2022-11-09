/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Omar
 */
public class Exo3 {
    public static void main(String args[]){
        ArrayList<String> ac = new ArrayList<String>();
        HashSet <String> sc = new HashSet<String>();
        HashSet <String> sc2 = new HashSet<String>();
        
        for(int i=1; i<=5; i++){
            ac.add(i+"");
            sc.add(i+"");
        }
        
        sc2.add("1");
        sc2.add("3");
        sc2.add("5");

        
        
        
        
        afficherCollStIt(ac);
        afficherCollStIt(sc);
        afficherCollStIt(sc2);
        
        System.out.println(isSubsetNoLoop(sc2,sc));
    }
    
    public static void afficherCollSt(Collection <String> list){
        for(String x: list)
            System.out.print(x + " ");
        System.out.println();
    }
    
    public static void afficherCollStIt(Collection <String> list){
        Iterator <String> iter = list.iterator();
        
        while(iter.hasNext())
            System.out.print(iter.next() + " ");
        System.out.println();
    }
    
    static boolean isSubset(Set<String> s1, Set<String> s2){
        for(String i:s1){
            if(!s2.contains(i))
                return false;
        }
        return true;
    }
        
    static boolean isSubsetNoLoop(Set<String> s1, Set<String> s2){
        return s2.containsAll(s1);
    }
    
}
