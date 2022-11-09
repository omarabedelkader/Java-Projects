package mypackage;

public class Claims{
	
	String Number;
	String CurrentDate ;
	String AccidentDate;
	String CarAccident;
	String HealthAccident;
	String Other;
	String ADamageInventory ;
	
	public Claims(String number, String currentDate, String accidentDate, String carAccident, String healthAccident,
			String other, String aDamageInventory) {
		super();
		Number = number;
		CurrentDate = currentDate;
		AccidentDate = accidentDate;
		CarAccident = carAccident;
		HealthAccident = healthAccident;
		Other = other;
		ADamageInventory = aDamageInventory;
	}
	public Claims() {
		super();
	}
	@Override
	public String toString() {
		return "Claims [Number=" + Number + ", CurrentDate=" + CurrentDate + ", AccidentDate=" + AccidentDate
				+ ", CarAccident=" + CarAccident + ", HealthAccident=" + HealthAccident + ", Other=" + Other
				+ ", ADamageInventory=" + ADamageInventory + "]";
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public String getCurrentDate() {
		return CurrentDate;
	}
	public void setCurrentDate(String currentDate) {
		CurrentDate = currentDate;
	}
	public String getAccidentDate() {
		return AccidentDate;
	}
	public void setAccidentDate(String accidentDate) {
		AccidentDate = accidentDate;
	}
	public String getCarAccident() {
		return CarAccident;
	}
	public void setCarAccident(String carAccident) {
		CarAccident = carAccident;
	}
	public String getHealthAccident() {
		return HealthAccident;
	}
	public void setHealthAccident(String healthAccident) {
		HealthAccident = healthAccident;
	}
	public String getOther() {
		return Other;
	}
	public void setOther(String other) {
		Other = other;
	}
	public String getADamageInventory() {
		return ADamageInventory;
	}
	public void setADamageInventory(String aDamageInventory) {
		ADamageInventory = aDamageInventory;
	}

}
