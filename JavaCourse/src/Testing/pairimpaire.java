/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

/**
 *
 * @author Omar
 */
public class pairimpaire {
    public static void main(String args[]){
        System.out.println(estPalindrome("Anthony"));
    }
    
    public static char estPalindrome(String s){
        int count =0;
        String s1 ="";
        int i = s.length()-1;
        if(count < s.length()){
            s1 += s.charAt(i);
            i--;
            count ++;
            estPalindrome(s);}
        return 0;
    }
    
}
