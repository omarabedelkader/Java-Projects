package CalculateFactory;

import java.util.Scanner;

public class Test {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        double num1 = input.nextDouble();
        
        System.out.println("Enter second number:");
        double num2 = input.nextDouble();
        
        System.out.println("Enter calculation needed Add, Subtract or Divide");
        CalculateFactory factory = new CalculateFactory();
        Calculate obj = factory.getCalculation(input.next());
        obj.calculate(num1, num2);
    }
}
