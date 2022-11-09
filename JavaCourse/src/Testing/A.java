/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

/**
 *
 * @author Omar
 */
public class A {
    int taille;
    A(int taille)
    {
        this.taille = taille;
    }
}

class AA extends A implements Modifiable{
    String nom;
    AA(String nom, int taille){
        super(taille);
        this.nom=nom;
    }
    public String toString(){
        return "AA : " + super.toString() + ", AA: " + nom;
    }
    public void zoomer(int n){
        if(n<MIN)
            n=MIN;
        if(n<MAX)
            n=MAX;
        if(n==0)
            n=1;
        if(n>0)
            taille *= n;
        else taille /= -n;
    }
}

 class B {
    int valeur;
    B(int valeur)
    {
        this.valeur = valeur;
    }
}

class BB extends B implements Modifiable{
    String chaine;
    BB(String chaine, int valeur){
        super(valeur);
        this.chaine=chaine;
    }
    public String toString(){
        return "BB : " + super.toString() + ", BB: " + chaine;
    }
    public void zoomer(int n){
        if(n<MIN)
            n=MIN;
        if(n<MAX)
            n=MAX;
        if(n==0)
            n=1;
        if(n>0)
            valeur *= 2*n;
        else valeur /= -n;
    }
}

interface Modifiable{
    static final int MIN = -5;
    static final int MAX = + 5;
    void zoomer (int n);
}

class Ex3{
    public static void main(String args[]){
        Modifiable [] tabMod = new Modifiable[4];
        tabMod[0] = new AA ("b1",10);
        tabMod[1] = new AA ("b2",20);
        tabMod[2] = new BB ("b3",30);
        tabMod[0] = new BB ("b3",50);
        for(int i=0; i<tabMod.length; i++){
            tabMod[i].zoomer(-2);
        }
        for(int i=0; i<tabMod.length; i++){
            System.out.println(tabMod[i]);
        }
    }
}
