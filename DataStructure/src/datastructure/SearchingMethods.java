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
public class SearchingMethods {
       
    public int count (int arr[], int e){
    
        int counter = 0;
            for(int i=0 ; i<= arr.length ; i++ ){
                if (arr[i] == e){
                counter ++;
                }
            }
            return counter;
}       
}
