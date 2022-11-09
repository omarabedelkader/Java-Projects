/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 *
 * @author Omar
 */
public class MyListTest {
    
    public static void main (String args[]){
        
        MyArrayList <String> list = new MyArrayList<String>();
        
        MyList <Integer> list2 = new MyArrayList<Integer>();
        
        list.add("Micheal");
        list.add("Walid");
        
        
        System.out.println(list.get(0));
    }
}
