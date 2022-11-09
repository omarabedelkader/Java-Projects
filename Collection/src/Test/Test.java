package Test;

import java.util.ArrayList;
import java.util.*;

public class Test<E> {
    protected List<E> ls = new ArrayList<E>();
    
    public boolean add(E v){
        if(!ls.contains(v)){
            ls.add(v);
            return true;
        }
        return false;
    }
    
    public boolean add2(E v){
        for(E el : ls)
            if(el.equals(v))
                return false;
        ls.add(v);
        return true;
    }
    
    public Iterator<E> iterator() {
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

    
    

