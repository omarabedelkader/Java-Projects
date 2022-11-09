/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PGCDetPPCM;
import java.util.Scanner;
/**
 *
 * @author Omar
 */
public class PGCDetPPCM {
    public static void main(String args[]){
        Scanner clavier = new Scanner(System.in);
        int x,y,a,b,pgcd,ppcm;
        
        System.out.println("Donnez deux entiers");
        System.out.println("x=");
        
        x = clavier.nextInt();
        a = x;

        System.out.println("y=");
        
        y = clavier.nextInt();
        b = y;
        
        System.out.println("Que Pensez vous? quel est le pgcd de ces deux entiers: " + x + " et " + y);
        
        pgcd = clavier.nextInt();
        
        while(x!=y){
            if(x>y)
                x-=y;
            else
                y-=x;
        }
        if(x==pgcd){
            System.out.println("Bravo!! vous avez raison le pgcd est:" + x);
            System.out.println("Quel est alors le ppcm de ces entiers?");
            ppcm = clavier.nextInt();
            if(ppcm==(a*b)/pgcd)
                System.out.println("Bravo!! vous avez raison le ppcm est:" + ppcm);
            else
                System.out.println("Desole!! vous n'avez pas raison car le ppcm est" + ppcm);
        }
        
        else
            System.out.println("Desole!! vous n'avez pas raison car le pgcd est" + x);  
    }
}
