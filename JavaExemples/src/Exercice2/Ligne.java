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
public abstract class Ligne {
    int numero;
    Abonne abonne;
    
    Ligne (int numero, Abonne abonne){
        this.numero = numero;
        this.abonne = abonne;
    }
    
    @Override
    public String toString(){
        return "numero: " + numero + " abonne: " + abonne;
    }
}
