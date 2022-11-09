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
public class ManutARisque extends Manutentionnaire implements Risque{
    
    public ManutARisque(String prenom, String nom, Date age, Date dateEntre, int heures) {
        super(prenom, nom, age, dateEntre, heures);
    }
    
    public double calculerSalaire() {
        return super.calculerSalaire() + Prime;
    }
    
}
