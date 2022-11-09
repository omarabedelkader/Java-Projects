package nfp121.pkg10833f.pkg1;
import java.io.*;
import java.util.*;
public class Strategy implements Strategie{
    String desc;
    String operat;
    String jok;
    String rech_mul;
    String type_fish;
    List<String> codes;
    List<String> text;
    String result = " l'occurence de Class est dans:\n";
    String objnom;
    String FileArea;
    
    ;
public Strategy(String objnom,String Description, String Operateur, String joker, String recherche_multiple , String type_fichier, List<String> codes , List<String> text, String FileArea) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        this.FileArea=FileArea;
        this.objnom = objnom;
        this.codes= codes;//list des fichiers codes
        this.text=text;// list des fichiers text
        desc  =Description;operat = Operateur;jok = joker;rech_mul = recherche_multiple;type_fish=type_fichier;

        LineNumberReader rdr = new LineNumberReader(new FileReader(text.get(1)));
        String st = "";
        while ((st = rdr.readLine()) != null)
        if (st.indexOf("Class")>=0)
        {
            String line = rdr.readLine();
            result = result +"ligne est : :"+ rdr.getLineNumber()+"\n";
        }
        rdr.close();
    }   
    @Override
        public String resolvestar()
        {
            return result;
        } 
  
}
