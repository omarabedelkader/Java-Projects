/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

/**
 *
 * @author Omar
 */
public class ElementList {
    String nom,unite;
    double quantite;
    int type;
    ElementList suivant;
    
    ElementList(String n, double q, String u, int t, ElementList s){
        nom = n;
        unite = u;
        quantite = q;
        type = t;
        suivant = s;
    }
    
    @Override
    public String toString(){
        return "nom: " + nom + ", unite: " + unite + ", quantite: " + quantite + ", type: " + type + ", suivant: " + suivant;
    }
}
