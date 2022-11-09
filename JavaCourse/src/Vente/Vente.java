/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vente;
import java.util.*;
/**
 *
 * @author Omar
 */
public class Vente {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String args[]){
        Vector f = new Vector();
        f.add(1);
        f.addElement(2);
        f.add(3);
        addelem(f,4);
        f.remove(0);
        f.setElementAt(1,0);
        
        System.out.println(f.capacity());
        afficheVector(f);
    }
    
    static void afficheVector(Vector V){
        System.out.println("Vector taille: " + V.size());
        for(int i =0; i<=V.size()-1; i++)
            System.out.println("Vect[" + i + "]=" + V.elementAt(i)+ ";");
    }
    
    static void addelem(Vector V, int a){
        V.add(a);
    }
}
