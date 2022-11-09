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
public abstract class Commercial extends Employe{
    double chiffreAffaire;
    
    public Commercial(String prenom, String nom, Date age, Date dateEntre, double chiffreAffaire) {
        super(prenom, nom, age, dateEntre);
        this.chiffreAffaire = chiffreAffaire;
    }
    
}
