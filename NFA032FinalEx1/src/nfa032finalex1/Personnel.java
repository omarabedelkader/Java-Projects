/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nfa032finalex1;

import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public class Personnel {
    private Employe[] staff;
    private int nbreEmploye;
    private final static int MaxEmploye = 200;
    
    public Personnel(){
        staff = new Employe[MaxEmploye];
        nbreEmploye = 0;
    }
    
    public void ajouterEmploye(Employe e){
        if(nbreEmploye <= MaxEmploye){
            staff[nbreEmploye ++] = e;
        }
        else{
            System.out.println("Pas plus de " + MaxEmploye + " employes");
        }
    }
    
    public void afficherSalaires(){
        for(int i = 0; i<nbreEmploye; i++){
            System.out.println(staff[i].getNom() + " gagne "
                + staff[i].calculerSalaire() + " Euros.");
        }
    }
    
    public double salaireMoyen(){
        double somme = 0;
        for(int i = 0; i<nbreEmploye; i++){
            somme += staff[i].calculerSalaire();
        }
        return somme/nbreEmploye;
    }
    
}
