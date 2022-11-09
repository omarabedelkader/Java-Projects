/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckIfDouble;
import java.util.Scanner;
/**
 *
 * @author Omar
 */
public class CheckIfDouble {

    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String s;
        System.out.println("Enter un nombre: ");
        s = input.next();
        System.out.println(test(s));
    }
    public static boolean test(String a){
        if(!exist(a, '.'))
            return false;
    
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != '.' && !Character.isDigit(a.charAt(i)))
                return false;
        }
    return true;
   
    }
    
    public static boolean exist (String s, char c){
        int count = 0;
        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) == c)
                count ++;
        }
        boolean t = count == 1;
        return t;
    }
    
}
