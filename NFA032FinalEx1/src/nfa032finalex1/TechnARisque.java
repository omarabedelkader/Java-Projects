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
public class TechnARisque extends Technicien implements ARisque {
    
    public TechnARisque(String nom, String prenom, Date naissance, Date dateService, int unites) {
        super(nom, prenom, naissance, dateService, unites);
    }
    
    public double calculerSalaire(){
        return super.calculerSalaire() + prime;
    }
    
}
