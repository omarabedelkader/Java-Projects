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
public class MyArrayList <AnyType> implements MyList <AnyType> {
    
    private AnyType arr[];
    
    public MyArrayList(){
        this.arr = (AnyType[]) new Object[0];
    }
    
    @Override
    public void add(AnyType item) {
        AnyType newArr[] = (AnyType[]) new Object[this.arr.length + 1];
        
        for(int i=0; i<this.arr.length; i++){
            newArr[i] = this.arr[i];
        }
        newArr[this.arr.length] = item;
        this.arr = newArr;
    }

    @Override
    public AnyType get(int index) {
        return this.arr[index];
    }
    
    
}