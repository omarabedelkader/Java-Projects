package FruitExercice;

public class TestFruit {
    public static void main (String args[]) throws Orange.PrixNegatifException{
        Basket b = new Basket();
        Fruit f1 = null, f2 = null, f3 = null, f4 = null;
        try{
            f1 = new Orange("Mandarine", 3000.0, "Liban");
            f2 = new Banane("Baladi", "Liban");
            f3 = new Orange("Mandarine", 3000.0, "France");
            f4 = new Banane("Baladi", "Colombia");
        }catch(Orange.PrixNegatifException e){

        }
        
        b.add(f1);
        b.add(f2);
        b.add(f3);
        b.add(f4);
        
        System.out.println(b.toString());
            
        b.SortCountryType();
        
        System.out.println("Apres Trie");
        System.out.println(b.toString());
    }
}
