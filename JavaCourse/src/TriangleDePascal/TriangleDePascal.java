/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TriangleDePascal;
import java.util.Scanner;
/**
 *
 * @author Omar
 */
public class TriangleDePascal {
    public static void main(String args[]){
        
        Scanner clavier = new Scanner(System.in);
        
        System.out.print("Entrez la dimension du triangle de Pascal: ");
        
        int n = clavier.nextInt();
        int number = 1;
        
        
        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(number + " ");  
                number = number * (i-j)/(j+1);
            }
            
            System.out.println();
            number =  1;

        }
        /*
        
        int i=0, j;
        int [][] Pas = new int [n][n+1];
        while(i<n)
        {
            for(j=0; j<=i+1; j++)
                if((j==0)||(j==i+1))
                    Pas[i][j]=1;
                else
                    Pas[i][j]=Pas[i-1][j-1]+Pas[i-1][j];
            i++;
            
            for(i=0; i<n; i++)
            {
                for(j=0; j<=i+1; j++)
                {
                    System.out.print(Pas[i][j] + " ");
                    System.out.println();
                }
            }
        }
*/
    }
}
