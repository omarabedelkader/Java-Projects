package testvoidmethod;

public class Etudiant {
    private String name;
    private int dateOfBirth;
    private DateDeNaissance ddn;
    
    public Etudiant(String name, int dateOfBirth, DateDeNaissance ddn){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.ddn = ddn;
    }
    
    public DateDeNaissance getddn(){
        return this.ddn;
    }
    
    public Etudiant(String name){
        this.name = name;
    }
    
    public int getAge(int n){
        return 2022 - n;
    }

    public String getName() {
        return name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    
    
    
}
