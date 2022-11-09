/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drawing_app;
import java.util.Scanner;
/**
 *
 * @author Omar
 */
public class Drawing_app {
    public static void main (String args[]){
        
        Scanner clavier = new Scanner(System.in);
        
        
        int lines;
        do{
            System.out.print("\n Donnez le nombre maximum des etoiles dans la derniere ligne: ");
            lines = clavier.nextInt();
            if(lines % 2 == 0)
                System.out.print("Le nombre des etoile doit etre impaire");
        }
        while(lines % 2 == 0);
        
        int spaces = lines;
        
        for(int star = 1; star <= lines; star +=2){
            for(int i = 0; i < spaces; i++){
                System.out.print(" ");
            }
            for(int j = 0; j < star; j++){
                System.out.print("*");
            }
            spaces -=1;
            System.out.println();
        }
        
        for(int j = 0; j < 2; j++){
            for(int i = 0; i < spaces + lines /2; i++){
                System.out.print(" ");
            }
            System.out.print("* *");
            System.out.println();
        }
    }
}
