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
public class Mobile extends Ligne{
    
    String reseau;
    
    public Mobile(int numero, Abonne abonne, String reseau) {
        super(numero, abonne);
        this.reseau = reseau;
    }
    
    @Override
    public String toString(){
        return super.toString()+" reseau: " + reseau;
    }
  
}
