package gestiondescontacts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class RealFileOutput implements RecordFile{

    @Override
    public OutputStream[] connectTo(String fileName) {
        File f = new File(fileName);
        FileOutputStream fos;
        ObjectOutputStream oos;
        OutputStream [] os = new OutputStream[2];
            
        try {
            fos = new FileOutputStream(f);
        } catch (FileNotFoundException ex) {
            fos = null;
            System.out.println("File not found");
        }
            
        try {
            oos = new ObjectOutputStream(fos);
        } catch (IOException ex) {
            oos = null;
            System.out.println("Connection error");
        }
        
        os[0] = fos;
        os[1] = oos;
        
        return os;

    }
    
}
