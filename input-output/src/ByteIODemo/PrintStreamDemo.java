package ByteIODemo;

import java.io.*;

public class PrintStreamDemo {
    public static void main(String args[]){
        File inFile = new File("C://Users//Omar//Documents//NetBeansProjects//input-output//src//ByteIODemo/BufferedStreamDemo.java");
        File outFile = new File("C://Users//Omar//Desktop/b.doc");
        
        if(inFile.exists()){
            int n, count = 0, bytesRead = 0;
            String s = "";
            try{
                InputStream is = new FileInputStream(inFile);
                PrintStream ps = new PrintStream(new FileOutputStream(outFile));
                
                while((n = is.read()) != -1 && n <= 40){
                    s += (char)n;
                    ps.print((char) n);
                    bytesRead++;
                }
                ps.println();
                while((n - is.read()) != -1 && bytesRead <= 50){
                    ps.println((char) n);
                    bytesRead ++;
                }
            }catch(IOException E){}
        }
        else
            System.out.println("File does not exist!");
    }
}
