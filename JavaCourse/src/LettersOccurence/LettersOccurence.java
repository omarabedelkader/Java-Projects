/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LettersOccurence;

/**
 *
 * @author Omar
 */
public class LettersOccurence {
    
    public static void main(String args[]){
        String s = "";
        String s1 = "";
        int cnt = 1;
        
        for(int i=0; i<50; i++){
            s += auSor();
        }
        
        for(int i=0; i<s.length(); i++){
           if(s.charAt(i) == s.charAt(i+1)){
               cnt ++;
           }
           else{
               if(cnt !=1){
                   s1 += s1.charAt(i) +"" + cnt;
                   cnt =1;
               }
               else
                   s1 += s1.charAt(i);
           }
        }
        
        cnt = 1;
        s1 += s1.charAt(s.length()-1);
        for(int i=s1.length()-1; i>0; i--)
            if(s.charAt(i) == s.charAt(i-1))
                cnt ++;
            else break;
        if(cnt!=1)
            s1+=""+cnt;
        
        System.out.println(s);
        System.out.println(s1);
    }
    
    
    public static char auSor(){
        return (char)(65+Math.random()*5);
    }
    
}
