package contact;

public class NewContact extends NewContactFrame {
	
	private static final long serialVersionUID = 1L;
	
	private String firstname;
	private String lastname ;
	private String city;
	private String adress;

        public NewContact(String firstname, String lastname, String city, String adress) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.city = city;
            this.adress = adress;
        }
        
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "NewContact [firstname=" + firstname + ", lastname=" + lastname + ", city=" + city + ", adress=" + adress
				+ "]";
	}
	
	

	
}
