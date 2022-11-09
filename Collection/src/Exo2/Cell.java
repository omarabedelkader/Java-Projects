package Exo2;

public class Cell {
        private int num;

        public Cell( int i){
            num = i;
        }
        public Cell(){
            
        }
        public int getNum(){ return num;}
        
        public void afficher() {
            System.out.println( num);
        }
    }
