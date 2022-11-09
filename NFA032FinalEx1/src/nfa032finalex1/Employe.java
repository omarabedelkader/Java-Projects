/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nfa032finalex1;
import java.util.Date;
/**
 *
 * @author Omar
 */
public abstract class Employe {

    private String nom;
    private String prenom;
    private Date naissance;
    private Date dateServie;
    
    public Employe(String nom, String prenom, Date naissance, Date dateService){
        this.nom = nom;
        this.prenom = prenom;
        this.naissance = naissance;
        this.dateServie = dateService;
    }
    
    public abstract double calculerSalaire();
    
    public String getNom(){
        return prenom + " " + nom;
    }
    
}
