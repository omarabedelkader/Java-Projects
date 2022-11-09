package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Vector;

/**
 * DÃ©crivez votre classe PileVector ici.
 * 
 * @author Omar
 * @version (un numÃ©ro de version ou une date)
 */
public class Pile3 implements PileI {

    private Vector<Object> v;
    private int ptr;

    public Pile3() {
        this(CAPACITE_PAR_DEFAUT);
    }

    public Pile3(int taille) {
        // traiter le cas <=0
        // Ã  complÃ©ter
        if (taille <= 0)
          taille = CAPACITE_PAR_DEFAUT;
        this.v = new Vector<Object>();
        this.ptr = -1;
        this.v.setSize(taille);
    }

    public void empiler(Object o) throws PilePleineException {
        // Ã  complÃ©ter
        if(estPleine())
            throw new PilePleineException();
        this.ptr ++;
        this.v.set(this.ptr, o);
    }

    public Object depiler() throws PileVideException {
        // Ã  complÃ©ter
        if(estVide())
            throw new PileVideException();
        Object temp = v.elementAt(ptr);
        v.set(ptr, null);
        ptr --;
        return temp;
    }

    public Object sommet() throws PileVideException {
        // Ã  complÃ©ter
        if(ptr < 0){
            return null;
        }
        return v.elementAt(ptr);
    }

    public int taille() {
        // Ã  complÃ©ter
        return this.ptr+1;
    }

    public int capacite() {
        // Ã  complÃ©ter
        return v.size();
    }

    public boolean estVide() {
        // Ã  complÃ©ter
        return this.ptr == -1;
    }

    public boolean estPleine() {
        // Ã  complÃ©ter
        return  this.ptr == this.v.size();
    }

    public String toString() {
        // Ã  complÃ©ter
        StringBuffer sb = new StringBuffer("[");
        for (int i = ptr; i >= 0; i--) {
            sb.append(v.get(i));
            if (i > 0)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object o) {
        // Ã  complÃ©ter
        if(o instanceof Pile3){
            if((this.taille() == Pile3.class.cast(o).taille()) &&  (this.capacite() == Pile3.class.cast(o).capacite())){
                for(int i = 0; i<v.size(); i++){
                    if(this.v.get(i) != Pile3.class.cast(o).v.get(i)){
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }

}
