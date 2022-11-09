/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ByteIODemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Omar
 */
public class ByteIODemo2 {
    public static void main(String args[]){
        File inFile = new File("C://Users/Omar//Desktop/a.txt");
        File outFile = new File("C://Users//Omar//Desktop/b.txt");
        
        if(inFile.exists()){
            byte[] b = new byte[(int) inFile.length()];
            try{
                int n;
                InputStream is = new FileInputStream(inFile);
                OutputStream os = new FileOutputStream(outFile);
                is.read(b);
                os.write(b);
                is.close();
                os.flush();
                os.close();
            }
            catch(IOException e){}
        }
        else
            System.out.println("File does not exist!");
    }
}
