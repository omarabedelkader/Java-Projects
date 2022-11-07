package MultiMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MultiMap<S, T> {
    private Map<S, ArrayList<T>> map;
    
    public MultiMap(){
        map = new HashMap<S, ArrayList<T>>();
    }
    
    public void put(S cle, T valeur){
        ArrayList<T> list;
        list = map.remove(cle);
        if(list == null)
            list = new ArrayList<T>();
        list.add(valeur);
        map.put(cle, list);
    }
    
    public ArrayList<T> get(S cle){
        if(!map.containsKey(cle))
            return new ArrayList<T>();
        return map.get(cle);
    }
    
    public boolean contains(S cle, T valeur){
        ArrayList <T> arr = map.get(cle);
        if(arr == null)
            return false;
        return arr.contains(valeur);
    }
        
}
