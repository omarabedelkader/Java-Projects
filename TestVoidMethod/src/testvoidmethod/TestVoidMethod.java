package testvoidmethod;

import java.text.Normalizer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TestVoidMethod {
    
    public static void main(String[] args) {
        System.out.println(login());
    }
    
    public static String login() {
        String n = "Chérf@ne";
        String p = "Anthony";
        
        //Remove accents from the accented characters in the nom and prenom
        n = Normalizer.normalize(n, Normalizer.Form.NFD);
        p = Normalizer.normalize(p, Normalizer.Form.NFD);
        n = n.replaceAll("[^\\p{ASCII}]", "");
        p = p.replaceAll("[^\\p{ASCII}]", "");
        
        //take only letters and replace special characters with _
        String newNom = n.replaceAll("[^a-zA-Z]", "_");
        String newPrenom = p.replaceAll("[^a-zA-Z]", "_");
        
        //concatenate nom with _ and prenom and return it lower case
        String result;
        if(newNom.length() <6)
            result = newNom + "_" + newPrenom.substring(0,1);
        else
            result = newNom.substring(0,6) + "_" + newPrenom.substring(0,1);
            
        return result.toLowerCase();
    }
    
}



