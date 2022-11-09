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
public abstract class Commercial extends Employe{
    
    private double chiffreDaffaire;
    
    public Commercial(String nom, String prenom, Date naissance, Date dateService, double chiffreDaffaire) {
        super(nom, prenom, naissance, dateService);
        this.chiffreDaffaire = chiffreDaffaire;
    }
    
    public double getChiffreDaffaire(){
        return chiffreDaffaire;
    }
    
}
