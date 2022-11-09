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
public class Technicien extends Employe{

    int nombreDunites;
    
    public Technicien(String nom, String prenom, Date naissance, Date dateService, int nombreDunites) {
        super(nom, prenom, naissance, dateService);
        this.nombreDunites = nombreDunites;
    }

    @Override
    public double calculerSalaire() {
        double salaire;
        salaire = 5 * nombreDunites;
        return salaire;
    }
    
    public String setNom(){
        return "Le Technicien " + super.getNom();
    }
    
}
