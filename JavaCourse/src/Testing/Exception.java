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
public class Exception {
    
public static void P () {
Scanner in = new Scanner(System.in);
int x = in.nextInt();
if (x >0) throw new Stop2();
}
public static void main(String [] args) {
System.out.println("Coucou 1"); // 1

try {
P ();
System.out.println("Coucou 2"); // 2
}
catch (Stop e) {
System.out.println("Coucou 3"); // 3
}
System.out.println("Coucou 4"); // 4
}
}

class Stop extends RuntimeException {}
class Stop2 extends RuntimeException {}
