package gestiondescontacts;

import java.io.InputStream;

public class ProxyFileInput implements RecordFile{
    
    private RealFileInput realFileInput;
    
    public ProxyFileInput(){
        realFileInput = new RealFileInput(); 
    }
        
    @Override
    public InputStream[] connectTo(String fileName) {
        InputStream [] inputStream = new InputStream[2];
        
        if(fileName.equals("Contacts")){
            inputStream = realFileInput.connectTo("Contacts.txt");
        }else if(fileName.equals("Groups")){
            inputStream = realFileInput.connectTo("Groups.txt");
        }else{
            System.out.println("not a valid file name");
        }
        return inputStream;
    }
}
