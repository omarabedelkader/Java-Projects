package gestiondescontacts;

import java.io.OutputStream;

public class ProxyFileOutput implements RecordFile{
    
    private RealFileOutput realFileOutput;
    
    public ProxyFileOutput(){
        realFileOutput = new RealFileOutput(); 
    }
        
    @Override
    public OutputStream[] connectTo(String fileName) {
        OutputStream [] outputStream = new OutputStream[2];
        
        if(fileName.equals("Contacts")){
            outputStream = realFileOutput.connectTo("Contacts.txt");
        }else if(fileName.equals("Groups")){
            outputStream = realFileOutput.connectTo("Groups.txt");
        }else{
            System.out.println("not a valid file name");
        }
        return outputStream;
    }
}
