package mypackage;

public class InsurancePolicy {
	String Number;
	String Date;
	String Terms;
	String Premium;
	String Coverage;
	String Insuranceplan;
	public InsurancePolicy(String number, String date, String terms, String premium, String coverage,
			String insuranceplan) {
		super();
		Number = number;
		Date = date;
		Terms = terms;
		Premium = premium;
		Coverage = coverage;
		Insuranceplan = insuranceplan;
	}
	public InsurancePolicy() {
		super();
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getTerms() {
		return Terms;
	}
	public void setTerms(String terms) {
		Terms = terms;
	}
	public String getPremium() {
		return Premium;
	}
	public void setPremium(String premium) {
		Premium = premium;
	}
	public String getCoverage() {
		return Coverage;
	}
	public void setCoverage(String coverage) {
		Coverage = coverage;
	}
	public String getInsuranceplan() {
		return Insuranceplan;
	}
	public void setInsuranceplan(String insuranceplan) {
		Insuranceplan = insuranceplan;
	}
	@Override
	public String toString() {
		return "InsurancePolicy [Number=" + Number + ", Date=" + Date + ", Terms=" + Terms + ", Premium=" + Premium
				+ ", Coverage=" + Coverage + ", Insuranceplan=" + Insuranceplan + "]";
	}
	
	
	

}
