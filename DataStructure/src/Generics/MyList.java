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
public interface MyList <AnyType> {
    
    public void add (AnyType item);
    public AnyType get (int index);
    
}
