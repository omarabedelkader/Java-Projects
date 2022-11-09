package Chap1_Ex1;

class SecondsToHMS{
    public static void main(String args[]){
        convert(45646);
    }
    
    public static void convert(int num){
        int heures = num/3600;
        int minutes = (num%3600)/60;
        int secondes = (num%3600)%60;
        
        System.out.println("Heure: " + heures + " minutes: " + minutes + " secondes: " + secondes);
    }
    
}
