package mypackage;

public class Vehicle{
	
	String PlateNumber;
	String Model;
	String VinNumber;   
	String Company;    
	String Type;   
	String CurrentSituation;
	String Statues;
	
	public Vehicle(String plateNumber, String model, String vinNumber, String company, String type,
			String currentSituation, String statues) {
		super();
		PlateNumber = plateNumber;
		Model = model;
		VinNumber = vinNumber;
		Company = company;
		Type = type;
		CurrentSituation = currentSituation;
		Statues = statues;
	}
	public Vehicle() {
		super();
	}
	@Override
	public String toString() {
		return "Vehicle [PlateNumber=" + PlateNumber + ", Model=" + Model + ", VinNumber=" + VinNumber + ", Company="
				+ Company + ", Type=" + Type + ", CurrentSituation=" + CurrentSituation + ", Statues=" + Statues + "]";
	}
	public String getPlateNumber() {
		return PlateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		PlateNumber = plateNumber;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getVinNumber() {
		return VinNumber;
	}
	public void setVinNumber(String vinNumber) {
		VinNumber = vinNumber;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getCurrentSituation() {
		return CurrentSituation;
	}
	public void setCurrentSituation(String currentSituation) {
		CurrentSituation = currentSituation;
	}
	public String getStatues() {
		return Statues;
	}
	public void setStatues(String statues) {
		Statues = statues;
	}
	

}
