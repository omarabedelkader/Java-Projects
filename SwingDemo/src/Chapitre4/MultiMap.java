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
public class MultiMap <S, T>{
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
        if(map.containsKey(cle))
            return map.get(cle);
        else
            return new ArrayList<T>();
    }
    
    public static void main (String args[]){
        MultiMap<String, Integer> map = new MultiMap<String, Integer>();
        map.put("toto", 1);
    }
}
