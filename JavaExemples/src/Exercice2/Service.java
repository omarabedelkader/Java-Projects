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
public abstract class Service {
    int numero;
    String description;
    double prixU;
    
    Service(int numero, String description, double prixU){
        this.numero = numero;
        this.description = description;
        this.prixU = prixU;
    }
    
    @Override
    public String toString(){
        return "numero: " + numero + " description: " + description + " prixU: " + prixU;
    }
}
