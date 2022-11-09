/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaires;

/**
 *
 * @author Omar
 */
public class Personnel {
    Employe[] collection;
    int nombreE;
    final static int maxE = 500;
    
    public Personnel() {
        collection = new Employe[maxE];
        nombreE = 0;
    }
    
    public void ajouterEmploye(Employe e) {
        if (nombreE <= maxE) {
            collection[nombreE++] = e;
        } else {
            System.out.println("Max " + maxE + " employes");
        }
    }
    
    public void calculerSalaires() {
        for (int i = 0; i < nombreE; i++) {
            System.out.println(collection[i].getNom() + " salaire est: " + collection[i].calculerSalaire() + " euros");
        }
    }
        
    public double salaireMoyen() {
        double somme = 0.0;
        for (int i = 0; i < nombreE; i++) {
            somme += collection[i].calculerSalaire();
        }
        return somme / nombreE;
    }
       
}
