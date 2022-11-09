package ByteIODemo;

import java.io.*;

public class DataStudent{
    
    static File f1 = new File("C://Users//Omar//Desktop//abc.txt");
    
    public static void main (String arg[]) throws FileNotFoundException, IOException {
        int [ ] number = {1, 2, 3};
        String [] name = {"Sami","Karim", "Fadi"};
        double [][] grades = {{12,13},{14, 15},{12.5,13.5}};

        //writeData(number, name, grades);
        readData();
         
    }
    
    public static void writeData(int [] number, String [] name, double [][] grades) throws FileNotFoundException, IOException {
        FileOutputStream os = new FileOutputStream(f1);
        BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
        int data;
        
        for(int i=0; i<number.length; i++){
            os.write(number[i]);
            bw.write(name[i]);
            for(int j=0; j<grades.length; j++)
                os.write((int) grades[i][j]);
        }
    }
    
    public static void readData() throws FileNotFoundException, IOException{
        FileInputStream is = new FileInputStream(f1);
        BufferedReader br = new BufferedReader(new FileReader(f1));
        
        int data;
        
        while((data = is.read()) != -1){
            System.out.println((char) data);
        }
    }
}
