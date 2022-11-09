package Exo4;

import java.util.ArrayList;
import java.util.Collection;

public class Personne{
    private String nom;
    private String prenom;
    private String ville;
    private Collection <String> telephone;
    
    public Personne(String nom, String prenom, String ville){
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        telephone = new ArrayList<String>();
    }
    
    public void ajouterTel(String s){
        telephone.add(s);
    }
    
    public String getAdress(){
        return ville;
    }
    
    public void afficher(){
        for(String x: telephone)
            System.out.print(x+", ");
    }
    
    public String toString(){
        return "Nom et prenom: " + nom + " " + prenom + ", Ville :" + ville;
    }
}
