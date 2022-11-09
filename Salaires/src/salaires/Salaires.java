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
public class Salaires {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personnel a = new Personnel();
        Date a1 = new Date(1,8,1996);
        Date a2 = new Date(6,16,2020);
        Date n1 = new Date(1,8,1997);
        Date n2 = new Date(6,16,2019);
        Date r1 = new Date(1,8,1995);
        Date r2 = new Date(6,16,2017);
        Date m1 = new Date(1,8,1994);
        Date m2 = new Date(6,16,2018);
        Date t1 = new Date(1,8,1995);
        Date t2 = new Date(6,16,2016);
        Date y1 = new Date(1,8,1994);
        Date y2 = new Date(6,16,2015);
        a.ajouterEmploye(new Vendeur("Anthony", "Cherfane", a1, a2, 1000));
        a.ajouterEmploye(new Representant("Nicolas", "Cherfane", n1, n2, 2000));
        a.ajouterEmploye(new Technicien("Rita", "Cherfane", r1, r2, 3000));
        a.ajouterEmploye(new Manutentionnaire("Maria", "Maria", m1, m2, 10));
        a.ajouterEmploye(new TechnARisque("Toni", "Khoury", t1, t2, 4000));
        a.ajouterEmploye(new ManutARisque("yorgo", "yorgo", y1, y2, 20));
        
        a.calculerSalaires();
        System.out.println("Le moyen des salaires est: " + a.salaireMoyen());
    }
    
}
