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
public class Banane implements Fruit{
    private String type;
    private String country;

    Banane (String type, String country){
        this.type = type;
        this.country = country;
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
        return 1500.0;
    }
    
    @Override
    public String toString(){
        return "Banane: " + getType() + " de " + getCountry() + " , " + getPrice() + " L.L.";
    }
}
