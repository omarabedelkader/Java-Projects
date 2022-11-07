/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiMap;

/**
 *
 * @author Anthony
 */
public class TestMultiMap {
    public static void main(String[] args) {
        MultiMap<String,Integer> map= new MultiMap<String,Integer>();
        map.put("toto",1);
        map.put("tutu",2);
        map.put("toto",3);
        System.out.println(map.get("toto"));
        System.out.println(map.get("tutu"));
        System.out.println(map.get("titi"));
        
    }    
}
