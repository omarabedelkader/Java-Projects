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
public class Internet extends Service{
    
    String isp;
    
    public Internet(int numero, String description, double prixU, String isp) {
        super(numero, description, prixU);
        this.isp = isp;
    }
    
    @Override
    public String toString(){
        return super.toString() + " isp: " + isp;
    }
}
