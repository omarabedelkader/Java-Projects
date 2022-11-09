/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NombreParfait;
import java.util.Scanner;
/**
 *
 * @author Omar
 */
public class NombreParfait {
    public static void main(String args[]){
        
        Scanner clavier = new Scanner(System.in);
        
        double n, compt=0, someDiv,numb, i;
        
        System.out.print("entre the nombre of the nopombre Parfait required: ");
        
        n = clavier.nextDouble();
        
        numb = 2;
        
        while (compt != n)
        {
            someDiv=1;
            i=2;
            while (i<=numb/2)
            {
                if(numb%i==0)
                    someDiv+=i;
                i++;
            }
            
            if(someDiv == numb){
                
                System.out.println(numb + " est un nombre parfait");
            compt++;
            }
        
          numb++; 
        
        }
    }
}
