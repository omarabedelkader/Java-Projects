/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacircle;
import java.util.Scanner;


public class AreaCircle {
    

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            double radius;
            double area;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the Radius:");
            radius = input.nextDouble();
            area = radius * radius * 3.14;

            
            System.out.println("the area for the circle of radius "+radius+" is:"+area );
            
            
    }
    
}
