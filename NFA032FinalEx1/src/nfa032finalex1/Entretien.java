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
public class Entretien extends Employe{

    double nombreDheures;
    
    public Entretien(String nom, String prenom, Date naissance, Date dateService, int nombreDheures) {
        super(nom, prenom, naissance, dateService);
        this.nombreDheures = nombreDheures;
    }
    
    @Override
    public double calculerSalaire() {
        double salaire;
        salaire = 65 * nombreDheures;
        return salaire;
    }
    
    public String setNom(){
        return "L'ouvrier " + super.getNom();
    }
    
}
