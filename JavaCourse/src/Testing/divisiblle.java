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
public class divisiblle {
    public static void main(String args[]){
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Entrer deux nombres entiers: ");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println(a + " est divisible par " + b + "    " + divisible(a,b) + " fois");
    }
    
    public static int divisible(int x, int y){
        int count = 1;
        while(x%y==0){
            if(x%y==0){
                x=x/y;
                count++;
            };
        }
        if(count >1)
            return count;
        else
            return 0;
    }
    
}
