package Exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Exam <E>{
    private Collection<E> liste = new ArrayList<E>();
    private Collection<E> liste2 = new ArrayList<E>();
    
    
    public int union (Collection<E> arg, Collection<E> list) {
        int count=0;
        for(E x:list){ 
            if(!arg.contains(x)){
                    liste2.add(x);
                    count ++;
                }    
            }
        return count;
    }
}
