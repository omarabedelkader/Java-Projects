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
public class Manutentionnaire extends Employe{
    int heures;
    
    public Manutentionnaire(String prenom, String nom, Date age, Date dateEntre, int heures) {
        super(prenom, nom, age, dateEntre);
        this.heures = heures;
    }

    @Override
    public double calculerSalaire() {
        return heures * 65.0;
    }
    
    public String getNom(){
        return "Le Manutentionnaire " + super.getNom();
    }
    
}
