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
public class TechnARisque extends Technicien implements Risque{
    
    public TechnARisque(String prenom, String nom, Date age, Date dateEntre, int unites) {
        super(prenom, nom, age, dateEntre, unites);
    }
    
    public double calculerSalaire() {
        return super.calculerSalaire() + Prime;
    }
    
}
