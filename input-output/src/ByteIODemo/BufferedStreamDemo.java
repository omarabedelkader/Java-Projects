package ByteIODemo;

import java.io.*;

public class BufferedStreamDemo {
    public static void main(String args[]){
        File inFile = new File("C://Users//Omar//Documents//NetBeansProjects//input-output//src//ByteIODemo/BufferedStreamDemo.java");
        File outFile = new File("C://Users//Omar//Desktop/b.doc");
        
        //& NFA035 Java library and patterns.
        if(inFile.exists()){
            int n, count = 0, bytesRead = 0;
            try{
                BufferedInputStream is = new BufferedInputStream(new FileInputStream(inFile));
                BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(outFile));
                
                while((n = is.read()) != -1 && n != '&')
                    bytesRead++;
                while(count<3){
                    is.mark(bytesRead-1);
                    while((n = is.read()) != '.')
                        os.write(n);
                    os.write('\n');
                    is.reset();
                    count++;
                }
            }catch(IOException E){}
        }
        else
            System.out.println("File does not exist!");
    }
}
