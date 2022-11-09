package input.output;

import java.io.*;

public class InputOutput {
    public static void main(String[] args)throws FileNotFoundException, IOException{
        FileInputStream fis = new FileInputStream("C:\\Users\\Omar\\Desktop\\abc.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Omar\\Desktop\\test.txt");

        
        int data; //the data read from the file are handled as bytes
        
        while ((data = fis.read()) !=-1){
            System.out.println("Data: " + (char)data);
            fos.write(5);
            
        }
        fis.close();
        fos.flush();
        fos.close();
    }
    
}
