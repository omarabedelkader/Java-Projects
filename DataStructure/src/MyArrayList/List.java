/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyArrayList;

/**
 * 
 * @author Omar
 * @param <T> any type
 */
public interface List<T> {        /*<AnyType> is a spesification*/
    
   /**
     * this method adds a T(any type) element to the end of the list 
     * @param item
 */
    
    void Add(T item);
    
    T getElement(int index);
        
    
}
