package ByteIODemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BytieIODemo {
    public static void main(String args[]){
        File inFile = new File("C://Users//Anthony//Desktop/a.txt");
        File outFile = new File("C://Users//Anthony//Desktop/b.txt");
        
        if(inFile.exists()){
            try{
                int n;
                InputStream is = new FileInputStream(inFile);
                OutputStream os = new FileOutputStream(outFile);
                while((n = is.read()) != -1)
                    os.write(n);
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
