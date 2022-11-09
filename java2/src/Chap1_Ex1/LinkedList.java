/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap1_Ex1;

/**
 *
 * @author Omar
 */
public class LinkedList {
    public static void main(String args[]){
        java.util.LinkedList<String> l = new <String> java.util.LinkedList();
        Integer[] A = {18, 4, 8, 13, -2, 4};
        
        for(int i = A.length-1; i>0; i--){
            selectIntoPosition(A,i);
        }
        
        for(int i=0; i<A.length; i++){
            System.out.println(A[i]);
        }
        
        
    }
    
    public static void selectIntoPosition(Integer[] arr, int pos){
        int max_index = 0;
        for(int i=0; i<=pos; i++){
            if(arr[max_index].compareTo(arr[i])<0){
                max_index = i;
            }
        }
        Integer temp = arr[max_index];
        arr[max_index] = arr[pos];
        arr[pos] = temp;
    }
}
