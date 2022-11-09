/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaires;

import java.util.Date;

/**
 *
 * @author Omar
 */
public abstract class Employe {
    String nom;
    String prenom;
    Date age;
    Date dateEntre;
    
    public abstract double calculerSalaire();
    
    public String getNom() {
        return prenom + " " + nom;
    }
    
    public Employe(String prenom, String nom, Date age, Date dateEntre) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateEntre = dateEntre;
    }
}
