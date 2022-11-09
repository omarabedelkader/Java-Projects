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
public class Demonstration extends Commercial {

    public Demonstration(String nom, String prenom, Date naissance, Date dateService, double chiffreDaffaire) {
        super(nom, prenom, naissance, dateService, chiffreDaffaire);
    }

    @Override
    public double calculerSalaire() {
        double salaire;
        salaire = 750 + (15* getChiffreDaffaire())/100;
        return salaire;
    }
    
    public void setNom(){
        System.out.println("Le representant " + getNom());
    }
    
}
