/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inetclass;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;
/**
 *
 * @author Omar
 */
public class Client_server {
     public static void main (String [] args) throws IOException{
        Scanner x=new Scanner (System.in);
      
        Socket ClientSocket = new Socket ("Thinkpad-E570",6789);
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader( ClientSocket.getInputStream()));
         String mmessage = inFromServer.readLine();  
          System.out.println(mmessage);
           String user = x.nextLine(); 
        DataOutputStream Outtoserver = new DataOutputStream (ClientSocket.getOutputStream());
         Outtoserver.writeBytes(user+'\n');
            String pmessage = inFromServer.readLine();
                System.out.println(pmessage);
              String pass = x.nextLine();
                
        
        Outtoserver.writeBytes(pass+'\n');
        String nmessage = inFromServer.readLine();
         System.out.println(nmessage);
       
       
       
    }
}
