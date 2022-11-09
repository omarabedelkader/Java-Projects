/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice6;
import java.util.Scanner;
/**
 *
 * @author Omar
 */
public class Exercice6 {
    
    static Scanner input = new Scanner(System.in);
    static double stat[] = new double[4];
    
    public static void main(String [] args){
        String [] nom = new String [3];
        double vente[][] = new double[3][4];
        saisie_Noms(nom);
        saise(vente);
    }
            
    public static void saisie_Noms(String [] Nom){
        for(int i = 0; i < Nom.length; i++){
            System.out.print("Vendeur: " + i + ": ");
            Nom[i] = input.nextLine();
        }
    }
    
    public static void saise(double [][] v){
        for(int i = 0; i< v.length; i++){
            for(int j =0; j < v[i].length; j++){
                System.out.print("Vendeur:" + i + ", Mois: " + j + " ");
                v[i][j] = input.nextDouble();
            }
        }
    }
    
    public static void statVendeur(double [][]v, int a){
        stat[0] = Double.MIN_VALUE;
        stat[1] = Double.MAX_VALUE;
        stat[2] = 0.0;
        stat[3] = 0.0;
        for(int j=0; j<v[a].length; j++){
            if (v[a][j]>stat[0])
            {
                stat[0]=v[a][j];
            }
            if (v[a][j]<stat[1]) {
                stat[1] = v[a][j];
            }
            stat[3]+=v[a][j];
        }
        stat[2]=stat[3]/v[a].length;
    }
    
}
