/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre4;

import java.util.*;

/**
 *
 * @author Omar
 */
public class MySet<E> {
    protected List<E> ls = new ArrayList<E>();
    public boolean add(E v){
        for(E el : ls){ // pour parcourir l'array list
            if(el.equals(v))
                return false;
        }
        ls.add(v);
        return true;
    }
    
    public Iterator<E> iterator(){
        return new Iterator<E>(){
            private int indice = 0;
            public boolean hasNext(){
                if(indice < ls.size())
                    return true;
                else
                    return false;
            }
            public E next(){
                return ls.get(indice++);
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }
}
