/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConvertDecimalNumber;
import java.util.Scanner;
/**
 *
 * @author Omar
 */
public class ConvertDecimalNumber {
    public static void main(String args[]){
        int n,temp, base;
    String s=" ";
    
    Scanner input = new Scanner(System.in);
    
    do{
        System.out.print("Entrer un entier positif: ");
        temp = input.nextInt();
    }while(temp<0);
    
    n = temp;
    
    do{
        System.out.print("Entrer la base entre 2 et 9: ");
        base = input.nextInt();
    }while(base<2 || base>9);
    
    switch(base){
        case 2:
            while(n!=0){              
                s += Integer.toString(n%2);
                n=n/2;
                s += " ";
            }
            break;
        case 3:
            while(n!=0){         
                s += Integer.toString(n%3);
                n=n/3;
                s += " ";
            }
            break;
        case 4:
            while(n!=0){           
                s += Integer.toString(n%4);
                n=n/4;
                s += " ";
            }
            break;
        case 5:
            while(n!=0){         
                s += Integer.toString(n%5);
                n=n/5;
                s += " ";
            }
            break;
        case 6:
            while(n!=0){            
                s += Integer.toString(n%6);
                n=n/6;
                s += " ";
            }
            break;
        case 7:
            while(n!=0){             
                s += Integer.toString(n%7);
                n=n/7;
                s += " ";
            }
            break;
        case 8:
            while(n!=0){         
                s += Integer.toString(n%8);
                n=n/8;
                s += " ";
            }
            break;
    }
    
    System.out.print(temp + " en base " + base + " = " +s);
    }
}
