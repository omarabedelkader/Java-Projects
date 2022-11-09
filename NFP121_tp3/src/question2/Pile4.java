package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Stack;

public class Pile4 implements PileI, Cloneable {
    /** la liste des Maillons/Elements */
    private Maillon stk;
    /** la capacitÃ© de la pile */
    private int capacite;
    /** le nombre */
    private int nombre;

    /**
     * Classe interne "statique" contenant chaque Ã©lÃ©ment de la chaine c'est une
     * proposition, vous pouvez l'ignorer !
     */
    private static class Maillon implements Cloneable {
        private Object element;
        private Maillon suivant;

        public Maillon(Object element, Maillon suivant) {
            this.element = element;
            this.suivant = suivant;
        }

        public Maillon suivant() {
            return this.suivant;
        }

        public Object element() {
            return this.element;
        }

        public Object clone() throws CloneNotSupportedException {
            Maillon m = (Maillon) super.clone();
            m.element = element;
            return m;
        }
    }

    /**
     * CrÃ©ation d'une pile.
     * 
     * @param taille
     *            la taille de la pile, la taille doit Ãªtre > 0
     */
    public Pile4(int taille) {
        if (taille <= 0)
            taille = CAPACITE_PAR_DEFAUT;
        this.stk = null;
        this.capacite = taille;
        this.nombre = 0;
    }

    public Pile4() {
        this(PileI.CAPACITE_PAR_DEFAUT);
    }

    public void empiler(Object o) throws PilePleineException {
        if (estPleine())
            throw new PilePleineException();
        // Ã  complÃ©ter
        if(estVide()){
            stk = new Maillon(o, null);
        }else{
            Maillon n = new Maillon(o, null);
            n.suivant = stk;
            stk = n;
//            Maillon temp = stk;
//            while(temp.suivant() != null){
//                temp = temp.suivant();
//            }
//            temp.suivant = new Maillon(o, null);
        }
        this.nombre ++;
    }

    public Object depiler() throws PileVideException {
        if (estVide())
            throw new PileVideException();
        // Ã  complÃ©ter
        Object temp = stk.element();
        stk = stk.suivant();
        this.nombre --;
        return temp;
    }

    public Object sommet() throws PileVideException {
        if (estVide())
            throw new PileVideException();
        return stk.element(); // Ã  complÃ©ter
    }

    /**
     * Effectue un test de l'Ã©tat de la pile.
     * 
     * @return vrai si la pile est vide, faux autrement
     */
    public boolean estVide() {
        return stk == null; // Ã  complÃ©ter
    }

    /**
     * Effectue un test de l'Ã©tat de la pile.
     * 
     * @return vrai si la pile est pleine, faux autrement
     */
    public boolean estPleine() {
        return nombre == capacite; // Ã  complÃ©ter
    }

    /**
     * Retourne une reprÃ©sentation en String d'une pile, contenant la
     * reprÃ©sentation en String de chaque Ã©lÃ©ment.
     * 
     * @return une reprÃ©sentation en String d'une pile
     */
    public String toString() {

        String s = "[";
        // Ã  complÃ©ter
        if(!estVide()){
            Maillon temp = stk;
            while(temp != null){
                s += temp.element();
                if(temp.suivant() != null)
                    s += ", ";
                temp = temp.suivant();
            }
        }
        return s + "]";
    }

    public boolean equals(Object o) {
        if (o instanceof Pile4) {
            // Ã  complÃ©ter
            if((this.taille() == Pile4.class.cast(o).taille()) &&  (this.capacite() == Pile4.class.cast(o).capacite())){
                Maillon temp = stk;
                Maillon temp1 = Pile4.class.cast(o).stk;
                while(temp != null && temp1 != null){
                    if(temp.element() != temp1.element()){
                        return false;
                    }
                    temp = temp.suivant();
                    temp1 = temp1.suivant();
                }
                return true;
            }
        }
        return false;
    }

    public int capacite() {
        return this.capacite;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public int taille() {
        return nombre;
    }
}