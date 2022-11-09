package question2;

public class NFP121_tp3 {

    public static void main(String[] args) throws Exception {
        
        
        test_Pile_estPleine();
    }
    
    public static void test_Pile_estPleine() throws Exception {
        PileI p = new question2.Pile4(3);
        
        
        p.empiler(3);
        System.out.println(p.toString());
        
        p.empiler(2);
        System.out.println(p.toString());
        
        p.empiler(1);
        System.out.println(p.toString());
        
        
        System.out.println("sommet: " + p.sommet());
        
        p.depiler();
        p.depiler();
        
        
        System.out.println(p.toString());
        
        p.empiler(532);
        
        System.out.println(p.toString());
        
        
        
//        try {
//            p.empiler(0);
//            p.empiler(7);
//            
//        } catch (Exception e) {
//            System.out.println("exception: " + (e instanceof question1.PilePleineException));
//        }
//        
//        System.out.println(p.toString());
//        
//        PileI p1 = new Pile2(3);
//        
//        p1.empiler(0);
//        p1.empiler(78);
//        p1.empiler(1);
//        
//        System.out.println(p1.toString());
//        
//        System.out.println(p.equals(p1));
//        
//        System.out.println("taille: " + p.taille());
//        
//        System.out.println("Capacite: " + p.capacite());
    }
    
}
