/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice1;
import java.util.Scanner;
/**
 *
 * @author Omar
 */
public class Exercice1{
    
    public static void main(String args[]){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Entrer un nombre decimal:");
        n = input.nextInt();
        System.out.println(n + " nombre en binaire: ");
        System.out.println(binaire(n));
    }
    
    public static String binaire(int n){
        int a;
        if(n > 0){
            a = n % 2;
            return (binaire(n / 2) + "" +a);
        }
        return "";
    }
    
}
