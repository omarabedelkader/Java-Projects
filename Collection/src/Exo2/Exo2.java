package Exo2;

import java.util.ArrayList;
import java.util.Iterator;

public class Exo2 {
    public static void main(String args[]){
        ArrayList <String> ls = new ArrayList<String>();
        for(int i=1; i<=6; i++)
            ls.add(i+"");
        /*ls.set(4, "Element remplacer"); //pour remplacer l'element dans 4
        ls.add(3, "Element ajoute");
        ls.remove(2);
        ls.add(30, "aa");
        afficheListeSt(ls);*/
        
        boolean b = ls.contains("4");
        System.out.println("Contient 4 ? " + b);
        int index = ls.indexOf("4");
        
        if (index == -1)
            System.out.println("Ne contient pas 4 " );
        else
            System.out.println("Contient 4 a la position : " + index );
        
        ls.add("1");
        afficheListeSt(ls);
        int lastIndex = ls.lastIndexOf("1");
        
        if (lastIndex == -1)
            System.out.println("Ne contient pas 1 " );
        else
            System.out.println("Derniere occurrence de 1 a la position : " + lastIndex );
        
        ArrayList <Cell> ce = new ArrayList<Cell>();
        
        for(int i=1; i<=5; i++){
            ce.add(new Cell(i));
        }
        
        afficheListeCell(ce);
    }
    
    public static void afficheListeSt(ArrayList<String> l){
        for(String i:l)
            System.out.println(i);
    }
    
    
    
    public static void afficheListeCell(ArrayList <Cell> c){
        for(Cell i : c)
            i.afficher();
        
        /*
        for (int i=0; i<c.size(); i++)
            c.get(i).afficher();
        */
    }
    
    
}
