/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;
import java.util.Scanner;
/**
 *
 * @author Omar
 */
public class examF {
    
    public static void main(String args[]){
        int n;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Introduire la taille n du tableau Tab : ");
            n = input.nextInt();
        }while(n<=0);
        
        int t [] = new int[n];
        
        System.out.println("Introduire les 8 éléments du tableau Tab : ");
        for(int i=0; i<t.length; i++){
            t[i] = input.nextInt();
        }
        
        if(!testTab(t)){
            System.out.println("Les éléments du tableau Tab ne sont pas triés par ordre croissant.");
            TrieCroissant(t);
            System.out.println("Le tableau trié devient : ");
            for(int i=0; i< t.length; i++){
                System.out.print(t[i] + "   ");
            }
        }
        System.out.println();
        System.out.print("Introduire une valeur : ");
        int val = input.nextInt();
        
        if(Recherche(t,val) == -1){
            System.out.println("Valeur introduite n’existe pas dans le tableau Tab");
        }
        else
            System.out.println("L’indice de la valeur introduite 10 dans le tableau Tab est : " + Recherche(t,val));
        
        System.out.println("Entrer la borne inférieure de l’intervalle de recherche: ");
        int minval = input.nextInt();
        
        System.out.println("Entrer la borne supérieure de l’intervalle de recherche: ");
        int maxval = input.nextInt();
        
        if(rechercheVal(t, minval, maxval) == -1)
            System.out.println("pas de valeur entre ces nombres");
        else
            System.out.println(rechercheVal(t, minval, maxval) + " est la première valeur entre 8 et 40 dans le tableau T.");
    }
    
    public static boolean testTab(int a[]){
        for(int i=0; i<a.length; i++){
            if(a[i] > a[i+1])
                return false;
        }
        return true;
    }
    
    public static void TrieCroissant(int tab[]){
        int temp;
        for (int i = 1; i < tab.length; i++) {
            for (int j = i; j > 0; j--) {
                if (tab[j] < tab [j - 1]) {
                    temp = tab[j];
                    tab[j] = tab[j - 1];
                    tab[j - 1] = temp;
                }
            }
        }
    }
    
    public static int Recherche(int b[], int v){
        for(int i = 0; i< b.length; i++){
            if(b[i] == v);
                return i;
        }
        return -1;
    }
    
    public static int rechercheVal(int c[], int minval, int maxval){
        if(!testTab(c))
            TrieCroissant(c);
        for(int i=0; i<c.length; i++){
            if(c[i] < minval && c[i]>maxval)
                return c[i];
        }
        return -1;
    }
    
}
