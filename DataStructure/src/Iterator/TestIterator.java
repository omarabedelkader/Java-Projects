/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.*;
/**
 *
 * @author Omar
 */
public class TestIterator {
    
    public static void main(String args[]){
        Collection <String> collection = new ArrayList<>();
        
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");
        
        Iterator <String> iterator = collection.iterator();
            while(iterator.hasNext()){
                System.out.print(iterator.next().toUpperCase()+" ");
            }
            System.out.println();
    }
}
