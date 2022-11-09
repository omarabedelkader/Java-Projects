/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inetclass;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Omar
 */
public class InetClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ad= InetAddress.getLocalHost();
        System.out.println(ad);
        InetAddress ad1 = InetAddress.getByName("thinkpad-e570");
        System.out.println(ad1);
        InetAddress sw[]= InetAddress.getAllByName("www.google.com");
        for (int i=0; i<sw.length; i++)
            System.out.println(sw[i]);
        byte [] b = new byte[4];
            b[0]=(byte)10;
            b[1]=(byte)1;
            b[2]=(byte)8;
            b[3]=(byte)105;
        InetAddress ad2= InetAddress.getByAddress(b);
                System.out.println(ad2);
        String address = ad1.getHostAddress();
         System.out.println(address);
         String Host = ad2.getHostName();
         System.out.println(Host);
    }
    
}
