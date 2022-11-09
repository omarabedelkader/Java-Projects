package testvoidmethod;

public class PolygoneRegulier {
    private int nombreDeCotes;
  private int longueurDuCote;

  PolygoneRegulier  ( int nCotes, int longueur) {
      this.nombreDeCotes = nCotes;
      this.longueurDuCote = longueur;
  }
  
  public boolean equals(PolygoneRegulier poly) {
    return poly.nombreDeCotes == nombreDeCotes  && poly.longueurDuCote == longueurDuCote;
  }


}
