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
public class Fixe extends Ligne{
    
    String local;
    
    Fixe(int numero, Abonne abonne, String local) {
        super(numero, abonne);
        this.local = local;
    }
    
    @Override
    public String toString(){
        return super.toString()+" local: " + local;
    }
}
