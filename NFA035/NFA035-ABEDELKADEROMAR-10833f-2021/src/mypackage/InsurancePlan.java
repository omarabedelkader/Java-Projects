package mypackage;

public class InsurancePlan {
    String obligatoryinsurance;   
    String allriskinsurance;       
    String vehicledamageinsurance;    
    String thepersonalinsuranceofthedriver; 
    String assistance;
    
    
	public String getObligatoryinsurance() {
		return obligatoryinsurance;
	}


	public void setObligatoryinsurance(String obligatoryinsurance) {
		this.obligatoryinsurance = obligatoryinsurance;
	}


	public String getAllriskinsurance() {
		return allriskinsurance;
	}


	public void setAllriskinsurance(String allriskinsurance) {
		this.allriskinsurance = allriskinsurance;
	}


	public String getVehicledamageinsurance() {
		return vehicledamageinsurance;
	}


	public void setVehicledamageinsurance(String vehicledamageinsurance) {
		this.vehicledamageinsurance = vehicledamageinsurance;
	}


	public String getThepersonalinsuranceofthedriver() {
		return thepersonalinsuranceofthedriver;
	}


	public void setThepersonalinsuranceofthedriver(String thepersonalinsuranceofthedriver) {
		this.thepersonalinsuranceofthedriver = thepersonalinsuranceofthedriver;
	}


	public String getAssistance() {
		return assistance;
	}


	public void setAssistance(String assistance) {
		this.assistance = assistance;
	}


	@Override
	public String toString() {
		return "InsurancePlan [obligatoryinsurance=" + obligatoryinsurance + ", allriskinsurance=" + allriskinsurance
				+ ", vehicledamageinsurance=" + vehicledamageinsurance + ", thepersonalinsuranceofthedriver="
				+ thepersonalinsuranceofthedriver + ", assistance=" + assistance + "]";
	}


	public InsurancePlan() {
		super();
	}


	public InsurancePlan(String obligatoryinsurance, String allriskinsurance, String vehicledamageinsurance,
			String thepersonalinsuranceofthedriver, String assistance) {
		super();
		this.obligatoryinsurance = obligatoryinsurance;
		this.allriskinsurance = allriskinsurance;
		this.vehicledamageinsurance = vehicledamageinsurance;
		this.thepersonalinsuranceofthedriver = thepersonalinsuranceofthedriver;
		this.assistance = assistance;
	}


	public static void main(String[] args) {
		

	}

}
