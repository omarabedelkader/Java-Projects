/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice2;


/**
 *
 * @author Omar
 */
public class Consommation {
    Ligne ligne;
    Service service;
    int mois;
    int annee;
    int nombreU;
    
    Consommation(Ligne ligne, Service servie, int mois, int annee, int nombreU )throws DateConsommationExcept{
        this.ligne = ligne;
        this.service = service;
        
        if(mois < 1 || mois > 12)
            throw new DateConsommationExcept("Erreur mois");
        
        this.mois = mois;
        if(annee < 2018)
            throw new DateConsommationExcept("Erreur mois");
        this.annee = annee;
        this.nombreU = nombreU;
    }
    
    double calcul (int nombreU, double prixU){
        return nombreU*prixU;
    }
    
    @Override
    public String toString(){
        return "Ligne: " + ligne + " Service: " + service + " mois: " + mois + " annee " + annee;
    } 
    
    class DateConsommationExcept extends Exception{
        DateConsommationExcept(String message){super(message);}
    }
    
}

