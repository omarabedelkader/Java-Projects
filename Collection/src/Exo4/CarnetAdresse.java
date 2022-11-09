/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exo4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Omar
 */
public class CarnetAdresse {
    private Collection <Personne> carnet;
    
    public CarnetAdresse(Personne p){
        carnet = new ArrayList<Personne>();
        carnet.add(p);
    }
    
    public void addPersonne(Personne p){
        carnet.add(p);
    }
    
    public void afficher(){
        Iterator <Personne> itr = carnet.iterator();
        Personne x;
        while(itr.hasNext()){
            x = itr.next();
            System.out.println(x);
            x.afficher();
        }
    }
    
    public void supprimer(String v){
        Iterator <Personne> itr = carnet.iterator();
        Personne x;
        while (itr.hasNext()){
            x = itr.next();
            if(x.getAdress().equals(v))
                itr.remove();
        }
    }
}
