/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestStringIfDouble;

/**
 *
 * @author Omar
 */
public class TestStringIfDouble {
    
    public static void main(String args[]){
        
        System.out.println(existsOnce("0.25",'.'));
    }
    
    public static boolean existsOnce(String s, char c){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == c){
                count ++;
            }
        }    
    return count == 1;
    }
    
    public static boolean checkDouble(String s){
        if(!existsOnce(s, '.')){
            return false;
        }
        for(int i =0; i<s.length(); i++){
            if(!(Character.isDigit(s.charAt(i)) || s.charAt(i) == '.'))
                return false;
        }
        return true;
    }
}
