/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author Omar
 */
public class Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int arr[] = {20,15,7,9,30};
        SearchingTest  s = new SearchingTest();
        boolean res = s.search(arr,15);
        System.out.println(res);
        SearchingMethods a = new SearchingMethods();
        int nb = a.count(arr,15);
        System.out.println(nb);
        
    }
    
}
