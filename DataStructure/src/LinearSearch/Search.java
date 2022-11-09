/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinearSearch;

/**
 *
 * @author Omar
 */
public class Search {
    
    public int searching(int arr[], int n){
        int found = -1;
        for(int i=0; i< arr.length ; i++){
            if (arr[i] == n)
              return i;  
            
                
        } 
        return found;
    }
    
}
