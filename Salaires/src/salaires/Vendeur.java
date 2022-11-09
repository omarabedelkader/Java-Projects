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
public class Vendeur extends Commercial{

    public Vendeur(String prenom, String nom, Date age, Date dateEntre, double chiffreAffaire) {
        super(prenom, nom, age, dateEntre, chiffreAffaire);
    }

    @Override
    public double calculerSalaire() {
        return (0.20 * chiffreAffaire) + 400;
    }
    
    public String getNom() {
        return "Le vendeur: " + super.getNom();
    }
    
}
