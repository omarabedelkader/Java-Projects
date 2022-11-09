/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nombre_premier;
import java.util.Scanner;
/**
 *
 * @author Omar
 */
public class Nombre_premier {
    public static void main(String args[]){
        int n, nbr, q, compt=0;
        boolean prem;
        
        Scanner clavier = new Scanner(System.in);
        System.out.println("combien de nombres premiers vous voulez?: ");
        n = clavier.nextInt();
        
        if(n==1)
            System.out.println(" \n les premier nombre premier est: 1" );
        else
        {
            System.out.print("Les " + n + " nombres premiers sont: ");
            System.out.print(2 + " ");
            nbr = 3;
            while(compt < n-1)
            {
                q=2;
                prem=true;
                do{
                    if(nbr%q==0)
                        prem=false;
                    
                    else
                        q+=1;
                }while((q<=nbr/2)&&(prem==true));
                if(prem==true){
                    compt++;
                    System.out.print(nbr + " ");
            }
            nbr++;
            }
        }
    }
}    

