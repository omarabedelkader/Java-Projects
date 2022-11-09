/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion_Entreprise_Salaire;
import java.util.Scanner;
/**
 *
 * @author Omar
 */
public class Gestion_Entreprise_Salaire {
    static Scanner clavier = new Scanner(System.in) ;
    static String[] noms = new String[10] ;
    static int[][] heures = new int[10][24] ;
    static double[] prix = new double[10] ;
    static int[] totHrs = new int[10] ;
    static double[] salaires = new double[10] ;
    
    public static void main(String args[]){

    }
    
    public static void entreeNoms(){
        for(int i = 0; i < noms.length ; i++){
            System.out.println("Entrer nom: " + i + " ");
            noms[i] = clavier.next();
        }
    }
    
    public static void entreeHeures(){
        for(int i = 0; i < heures.length ; i++){
            for(int j = 0; j < heures[i].length ; j++){
                do{
                    System.out.println("Entrer l'heure: " + i + " ," + j);
                    heures[i][j] = clavier.nextInt();
                }while(heures[i][j]<0);
            }
        }    
    }
    
    public static void entreePrix(){
        for(int i = 0; i < prix.length ; i++){
            do{
                System.out.println("Entrer le prix: " + i + " ");
                prix[i] = clavier.nextInt();
            }while(prix[i]<=0);
        }
    }
    
    public static void totalHeures(){
        for(int i = 0; i < heures.length; i++){
            for(int j = 0; j< heures[i].length; j++)  
                totHrs[i] += heures[i][j];
        }
    }
    
    public static void calcSalaires(){
        for(int i = 0; i < salaires.length; i++){
            salaires[i] = prix[i] * totHrs[i];
        }
    }
    
    public static void afficheSalaires(){
        for(int i =0; i < noms.length; i++){
            System.out.print("Nom: " + noms[i] +" Salaire: " + salaires[i]);
        }   
    }
    
    public static double maxSalaire(){
        double max = 0;
        for(int i = 0; i < salaires.length; i++){
            if(salaires[i] > max){
                max = salaires[i];
            }
        }
        return max;
    }
    
    public static String maxNom(){
        double max = maxSalaire();
        for(int i = 0; i< salaires.length; i++){
            if(salaires[i] == max){
                return noms[i];
            }
        }
        return null;
    }
}
