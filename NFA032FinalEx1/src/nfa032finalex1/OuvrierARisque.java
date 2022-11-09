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
public class OuvrierARisque extends Entretien implements ARisque {

    public OuvrierARisque(String nom, String prenom, Date naissance, Date dateService, int heures) {
        super(nom, prenom, naissance, dateService, heures);
    }
    
    public double calculerSalaire(){
        return super.calculerSalaire() + prime;
    }

}
