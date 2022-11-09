package mypackage;

public class Customer{
	
	String Name;
	String FatherName;
	String FamilyName;
	String DateOfBirthday;
	String Address;
	String MobileNumber;
	String Email;
	
	public Customer(String name, String fatherName, String familyName, String dateOfBirthday, String address,
			String mobileNumber, String email) {
		super();
		Name = name;
		FatherName = fatherName;
		FamilyName = familyName;
		DateOfBirthday = dateOfBirthday;
		Address = address;
		MobileNumber = mobileNumber;
		Email = email;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [Name=" + Name + ", FatherName=" + FatherName + ", FamilyName=" + FamilyName
				+ ", DateOfBirthday=" + DateOfBirthday + ", Address=" + Address + ", MobileNumber=" + MobileNumber
				+ ", Email=" + Email + "]";
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public String getFamilyName() {
		return FamilyName;
	}
	public void setFamilyName(String familyName) {
		FamilyName = familyName;
	}
	public String getDateOfBirthday() {
		return DateOfBirthday;
	}
	public void setDateOfBirthday(String dateOfBirthday) {
		DateOfBirthday = dateOfBirthday;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
	}

