/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp_tab_ex2;
import java.util.Scanner;
/**
 *
 * @author Omar
 */
public class Tp_tab_ex2 {
    public static void main (String args []){
        int [] number = {12,9,13,10,8,15,22,8,13,14};
        int indice1,indice2,i,max=0,indicemax=0,sum=0,temp;
        float moyen;
        
        Scanner clavier = new Scanner (System.in);
        
        do{
        System.out.println("\n Quelles sont lees indices des deux nombres a echanger: ");
        indice1 = clavier.nextInt();
        indice2 = clavier.nextInt();
        if(indice1 >= number.length || indice2 >= number.length)
            System.out.print("les indices ne peuvent pas depasser " + (number.length-1));
        }while(indice1 >= number.length || indice2 >= number.length);
        
        System.out.print("Le tableau avant le changement: ");
        for(i = 0; i < number.length; i++)
            System.out.print(number[i] + " ");
        
        temp = number[indice1];
        number[indice1] = number[indice2];
        number[indice2] = temp;
        
        System.out.print("\n Le tableau apres le changement: ");
        for(i = 0; i < number.length; i++)
            System.out.print(number[i] + " ");
        
        
        for(i = 0; i < number.length; i++){   
            if(number[i]>max){
                max = number[i];
                indicemax = i;
            }
        }
        
        for(i = 0; i < number.length; i++){
            sum+=number[i];
        }

        System.out.print("\n L'indice de plus grand entier qui est " + max + " est: " + indicemax);
        System.out.println("\n Le moyen des nombres est: " + ((float)sum/number.length));
        
        if(indicemax != number.length-1){
            temp = number[number.length-1];
            number[number.length-1] = number[indicemax];
            number[indicemax] = temp;
        }
        
        System.out.print("\n Le tableau apres le changement: ");
        for(i = 0; i < number.length; i++)
            System.out.print(number[i] + " ");
        
    }
}
