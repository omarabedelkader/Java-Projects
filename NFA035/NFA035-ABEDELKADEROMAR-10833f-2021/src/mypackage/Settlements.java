package mypackage;

public class Settlements {
	String cash;
	String twosettlements;
	String threesettlements;
	String fourettlements;
	public Settlements(String cash, String twosettlements, String threesettlements, String fourettlements) {
		super();
		this.cash = cash;
		this.twosettlements = twosettlements;
		this.threesettlements = threesettlements;
		this.fourettlements = fourettlements;
	}
	
	public Settlements() {
		super();
	}
	
	@Override
	public String toString() {
		return "Settlements [cash=" + cash + ", twosettlements=" + twosettlements + ", threesettlements="
				+ threesettlements + ", fourettlements=" + fourettlements + "]";
	}
	
	public String getCash() {
		return cash;
	}
	
	public void setCash(String cash) {
		this.cash = cash;
	}
	
	public String getTwosettlements() {
		return twosettlements;
	}
	
	public void setTwosettlements(String twosettlements) {
		this.twosettlements = twosettlements;
	}
	
	public String getThreesettlements() {
		return threesettlements;
	}
	
	public void setThreesettlements(String threesettlements) {
		this.threesettlements = threesettlements;
	}
	
	public String getFourettlements() {
		return fourettlements;
	}
	
	public void setFourettlements(String fourettlements) {
		this.fourettlements = fourettlements;
	}
	
}
