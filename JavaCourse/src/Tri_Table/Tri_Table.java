/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tri_Table;
import java.util.Scanner;
/**
 *
 * @author Omar
 */
public class Tri_Table {
    public static void main(String args[]){
        
        int n, i, j, k, temp;
        char c;
        
        Scanner clavier = new Scanner(System.in);
        
        System.out.print("Quelle est la dimension du tableau a entrer?: ");
        n = clavier.nextInt();
        
        int [] a = new int [n];
        
        System.out.print("\n Entrez les entiers pour remplir le tableau: ");
        
        for(i=0; i<n; i++)
            a[i] = clavier.nextInt();
        
        System.out.print("le tableau que vous avez remplie est: " );
        for(i=0; i<n; i++)
            System.out.print(a[i] + " ");
        
        System.out.print("vous voulez trier se tableau? Y/N");
        do{
            c = clavier.next().charAt(0);
            if(!(c=='y' || c=='Y' || c=='n' || c=='N'))
                System.out.println("Il faut entrer Y/N");
        }while(!(c=='y' || c=='Y' || c=='n' || c=='N'));
        
        if(c=='Y' || c=='y'){
            System.out.println("1-Triage croissante" + " " + "2-Triage decroissante");
            k = clavier.nextInt();
            switch(k){
                
                case 1: {
                    for(i=0; i<n-1; i++)
                        for(j=1; j<n; j++)
                            if(a[i]>a[j]){
                                temp = a[i];
                                a[i] = a[j];
                                a[j] = temp;
                            }
                    System.out.print("le tableau est trie d'une maniere croissante sera: ");
                    for(i=0; i<n; i++)
                        System.out.print(a[i] + " ");
                    break;
                }
                
                case 2: {
                    for(i=0; i<n-1; i++)
                        for(j=1; j<n; j++)
                            if(a[i]<a[j]){
                                temp = a[i];
                                a[i] = a[j];
                                a[j] = temp;
                            }
                    System.out.print("le tableau est trie d'une maniere decroissante sera: ");
                    for(i=0; i<n; i++)
                        System.out.print(a[i] + " ");
                    break;
                }
                
                default:{
                    System.out.print("le tableau reste le meme: ");
                    for(i=0; i<n; i++)
                        System.out.print(a[i] + " ");
                }  
            }
        }
        
        else{
           System.out.print("le tableau reste le meme: ");
           for(i=0; i<n; i++)
                System.out.print(a[i] + " "); 
        }
        
    }
}
