package testvoidmethod;

public class DateDeNaissance {
    public int jour, mois, anne;
    
    public DateDeNaissance(int nhar, int mois, int anne){
        this.jour = nhar;
        this.mois = mois;
        this. anne = anne;
    }
    
    public String afficherDate(){
        return "Jour: " + jour + ", mois: " + mois + ", année: " + anne;
    }
}
