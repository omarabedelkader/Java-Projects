/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;
import java.util.Scanner;
/**
 *
 * @author Omar
 */
public class JavaCourse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        System.out.println("Entrer la longeur du rectangle:");
        int n1 = input.nextInt();
        
        System.out.println("Entrer la largeur du rectangle:");
        int n2 = input.nextInt();
        
        rectangle(n1, n2);
        
        */
        /*
        System.out.println("Entrer la longeur du tableau:");
        int len = input.nextInt();
        
        char tab [] = new char[len];
        
        for(int i=0; i<len; i++){
            System.out.println("Entrer les caracteres: ");
            tab [i] = input.next().charAt(0);
        }
        
        System.out.println("Entrer l'element voulue:");
        char el = input.next().charAt(0);
        
        System.out.println(el + " appartient au tableau?: " + search(el, tab));
        
        
        System.out.println("nombre D'occurence: " + occurence(el, tab));
        */
        
        
        System.out.println("Entrer la longeur du premier tableau:");
        int len1 = input.nextInt();
        
        System.out.println("Entrer la longeur du second tableau:");
        int len2 = input.nextInt();
        
        char tab1 [] = new char[len1];
        char tab2 [] = new char[len2];
        
        for(int i=0; i<len1; i++){
            System.out.println("Entrer les caracteres du premier tableau: ");
            tab1 [i] = input.next().charAt(0);
        }
        
        for(int i=0; i<len2; i++){
            System.out.println("Entrer les caracteres de  second tableau: ");
            tab2 [i] = input.next().charAt(0);
        }
        
        System.out.println("Comparaison entre ces deux tableaux: " + compTable(tab1, tab2));

        
    }
    
    public static void rectangle(int lar, int lon){
        for(int i=0; i<lon; i++){
            for(int j=0; j<lar; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static boolean search (char el, char tab[]){
        int n=0;
        for(int i =0; i<tab.length; i++){
            if (tab[i] == el){
                n = 1;
            }
        }
        return n== 1; 
    }
    
    public static int occurence (char el, char tab[]){
        int n=0;
        for(int i =0; i<tab.length; i++){
            if (tab[i] == el){
                n += 1;
            }
        }
        return n; 
    }
    
    
    public static boolean compTable(char tab1[], char tab2[]){
        int n =0;
        for (int i = 0; i<tab1.length; i++){
            for(int j=0; j<tab2.length; j++){
                if(tab1[i] == tab2 [j]){
                    n++;
                }
            }
        }
        return n >= tab1.length;
    }
    
}
