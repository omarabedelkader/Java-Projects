/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nfa032finalex1;

import java.util.Date;

/**
 *
 * @author Omar
 */
public class Test {
    public static void main(String args[]){
        Personnel p = new Personnel();
        Date p1 = new Date(9,12,1975);
        Date p2 = new Date(10,31,2015);
        Date l1 = new Date(8,15,1988);
        Date l2 = new Date(1,6,2015);
        Date y1 = new Date(3,27,1984);
        Date y2 = new Date(10,17,2018);
        Date je1 = new Date(10,4,1989);
        Date je2 = new Date(8,15,2013);
        Date j1 = new Date(9,12,1978);
        Date j2 = new Date(10,31,2015);
        Date al1 = new Date(12,23,1963);
        Date al2 = new Date(11,28,2010);
        p.ajouterEmploye(new Ventes("Pierre", "Business", p1, p2, 3000));
        p.ajouterEmploye(new Demonstration("Léon", "Vendtout", l1, l2, 2000));
        p.ajouterEmploye(new Technicien("Yves", "Bosseur", y1, y2, 1000));
        p.ajouterEmploye(new Entretien("Jane", "Stoc", je1, je2, 45));
        p.ajouterEmploye(new TechnARisque("Jean", "Flippe", j1, j2, 1000));
        p.ajouterEmploye(new OuvrierARisque("Al", "Abordage", al1, al2, 45));
        
        p.afficherSalaires();
        System.out.println("Le salaire moyen dans l'entreprise est de " + p.salaireMoyen() + " Euros.");
    }
}
