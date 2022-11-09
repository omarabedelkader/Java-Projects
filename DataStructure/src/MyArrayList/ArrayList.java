/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyArrayList;

/**
 *  
 * @author Omar
 * @param <T>
 */
public class ArrayList<T> implements List<T> {
    
    private T [] theArray;// int [] theArray 
    private int theSize;
    private static final int CAPACITY = 10;

    @Override
    public void Add(T item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T getElement(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
