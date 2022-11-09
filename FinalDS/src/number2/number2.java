/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number2;

import java.util.*;

public class number2 {
    
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);

        System.out.println("numbers:");

             for(int i= 0; i<10; i++){
        integers.add(input.nextInt());
             }
      
        int j = 0;
        for (int i = 0; i < 10; i++) {

            if (integers.get(i) % 2 != 0) {
                
                j += integers.get(i);
            }
        }  
         System.out.println(j);
    }
}

