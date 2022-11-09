/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final2018;
import java.util.Scanner;
/**
 *
 * @author Omar
 */
public class Ex1 {
    
    public static void main(String args[]){
        double a,b,c;
        char [] tab = {'a','b','c'};
        char [] tab1 = {'g','f','e', 'd'};
        Scanner input = new Scanner(System.in);
       
        System.out.println(recherche1(tab, tab1));
    }
        
    public static double smallestNumber(double a, double b, double c){
        if(a<b && a<c)
            return a;
        else if(b<a && b<c)
            return b;
        else
            return c;
    }
    
    public static double computeAVG(double a, double b, double c){
        return ((a+b+c)/3);
    }
    
    public static String middleCHAR(String s){
        if(s.length()%2 == 0){
            char c1 = s.charAt(s.length()/2);
            char c2 = s.charAt((s.length()/2)-1);
            String s1 = String.valueOf(c1);
            s1 += String.valueOf(c1);
            return s1;
        }
        else{
            return String.valueOf(s.charAt(s.length()/2));
        }
    }
    
    public static int countVowels(String s){
        int count =0;
        
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }

    public static int sumNumbers(int a){
        int sum =0;
        while(a>0){
            sum += a%10;
            a = a/10;
        }
        return sum;
    }
    
    public static String subString(String s){
        return s.substring(2,4);
    }
    
    public static int recherche(char [] tab, char c){
        int count =0;
        for(int i=0; i<tab.length; i++){
            if (tab[i] == c)
                count ++;
        }
        return count;
    }
    
    public static boolean recherche1(char tab[], char tab1[]){
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab1.length; j++){
                if(tab[i] == tab1[j])
                    return true;
            }
        }
        return false;
    }
    
    
}
