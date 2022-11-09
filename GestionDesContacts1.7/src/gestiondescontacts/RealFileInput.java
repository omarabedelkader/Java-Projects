package gestiondescontacts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class RealFileInput implements RecordFile{

    @Override
    public InputStream[] connectTo(String fileName) {
        FileInputStream fis;
        ObjectInputStream ois;
        File f = new File(fileName);
        InputStream [] inputStream = new InputStream[2];
        
        try {
            fis = new FileInputStream(f);
        } catch (FileNotFoundException ex) {
            fis = null;
            System.out.println("File not found");
        }
        
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException ex) {
            ois = null;
            System.out.println("Connection error");
        }
        
        inputStream[0] = fis;
        inputStream[1] = ois;
        
        return inputStream;
    }
    
}
