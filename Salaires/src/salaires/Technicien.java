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
public class Technicien extends Employe{
    int unites;
    
    public Technicien(String prenom, String nom, Date age, Date dateEntre, int unites) {
        super(prenom, nom, age, dateEntre);
        this.unites = unites;
    }

    @Override
    public double calculerSalaire() {
        return unites * 5.0;
    }
    
    public String getNom(){
        return "Le technicien: " + super.getNom();
    }
    
}
