/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserver;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class Server {
    
    public static void main (String []args) throws IOException{
        
            ServerSocket x = new ServerSocket(6789);
       
    System.out.println ("Socket is created on port 6789");
    while(true){
    Socket y= x.accept();
    BufferedReader infclient = new BufferedReader(new InputStreamReader(y.getInputStream()));
    
    DataOutputStream outtoclient = new DataOutputStream (y.getOutputStream());
    
    //outtoclient.writeBytes("the message in capital letter is"+capmessage+'\n');
    outtoclient.writeBytes("Enter user name: "+'\n');
    
    String g= infclient.readLine();
    if(g.equals("anthony")){
        outtoclient.writeBytes("Enter password:"+'\n');
            String p= infclient.readLine();
                if(p.equals("P@ssw0rd")){
                    outtoclient.writeBytes("you are successfully authenticated!"+'\n');
                }
                else
                    outtoclient.writeBytes("wrong password"+'\n');
    }
    else 
        outtoclient.writeBytes("Invalid user name.."+'\n');
    //String capmessage= message.toUpperCase();
   
    }  } 
    }
