/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FruitExercice;

/**
 *
 * @author Omar
 */
public class Orange implements Fruit{
    private String type;
    private double prix;
    private String country;
    
    Orange (String type, double prix,  String country)throws PrixNegatifException{
        this.type = type;
        
        this.prix = prix;
        
        if(this.prix <0) 
            throw new PrixNegatifException("il n'est pas possible de creer des oranges avec un prix negatif");
        
           
        this.country = country;
    }
    
    @Override
    public String toString(){
        return "Orange: " + getType() + " de " + getCountry() + " , " + getPrice() + " L.L.";
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getPrice() {
        return prix;
    }
    
    public class PrixNegatifException extends Exception{
        PrixNegatifException(String msg){
            super(msg);
        }
    }
    
}
