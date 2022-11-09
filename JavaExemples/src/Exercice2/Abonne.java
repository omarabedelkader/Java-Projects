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
public class Abonne {
    private int numSeq;
    private String nom;
    private String address;
    
    Abonne (int numSeq, String nom, String address){
        this.numSeq = numSeq;
        this.nom = nom;
        this.address = address;
    }
    
    int getNumSeq(){
        return numSeq;
    }
    String getNom(){
        return nom;
    }
    String getAddress(){
        return address;
    }
    
    void setNumSeq(int numSeq){
        this.numSeq = numSeq;
    }
    void setNom(String nom){
        this.nom = nom;
    }
    void setAddress(String address){
        this.address = address;
    }
    
    @Override
    public String toString(){
        return "Num Seq: " + numSeq + " nom: " + nom + " address: "+ address;
    }
}
