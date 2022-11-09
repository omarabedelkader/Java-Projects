/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

/**
 *
 * @author Omar
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr1 [] = {20,50,60,5};
        Search test = new Search();
        int j = test.searching(arr1,5);
        System.out.println(j);
    }
    
}
