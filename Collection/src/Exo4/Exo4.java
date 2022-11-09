/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exo4;

public class Exo4 {
    public static void main(String args[]){
        Personne p1 = new Personne ("Khalil", "Sami", "Beirut");
        p1.ajouterTel("11-111222");
        p1.ajouterTel("44-999222");

        CarnetAdresse cr = new CarnetAdresse(p1);

        Personne p2 = new Personne ("Karam", "Fadi", "Byblos");
        p2.ajouterTel("77-333444");
        p2.ajouterTel("55-777222");
        p2.ajouterTel("88-333444");
        p2.ajouterTel("88-777222");
        cr.addPersonne(p2);

        Personne p3 = new Personne ("Sarah", "Salim", "Byblos");
        p3.ajouterTel("77-999888");
        p3.ajouterTel("55-788882");

        cr.addPersonne(p3);
        cr.afficher();
        cr.supprimer("Byblos");
        System.out.println ("Apres suppression ");
        System.out.println("**");
        cr.afficher();
    }
}

