/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex4_Partiel2020;
import java.util.Scanner;
/**
 *
 * @author Omar
 */
public class Ex4_Partiel2020 {
    public static void main (String args[]){
        double s[][] = {{10.5 , 15.2, 20.5 , 50.7},{11.5 , 10.7 , 20.8, 56.7}};
        
        double arr1 [] = test(s, 0);
        for(int i=0; i< arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
    
    public static double[] test(double v[][], int a){
        double min = v[a][0], max = 0, moyenne =0, somme =0, arr[] = new double[4];
        
        for(int i=0; i<v[a].length; i++){
            if(min >= v[a][i])
                min=v[a][i];
            if(max <= v[a][i])
                max = v[a][i];
            somme += v[a][i];
        }
        
        moyenne = somme / v[a].length;
        
        arr[0] = min;
        arr[1] = max;
        arr[2] = moyenne;
        arr[3] = somme;
        
        return arr;
    }
    
}
