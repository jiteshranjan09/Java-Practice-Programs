package oOpsPart1;

public class StaticKeyword {

		//Use Static variable, Static method & Static block;
	
	static String ClientName = "AVEVA";  //Static variable
	
	 //Non-static variables 
	
	 String Empid; String ClientEmpID; String EmpName; String EmpMobileNumber; 
	  
	  static String	  Address;
	 
	  static String CompnayName,Location,ClientLocation;
	
	//Static block 
	 static {
		
		  CompnayName = "CTS";
		  Location = "Hyderabad";
		  ClientLocation = "WaveRock";
	}


	 StaticKeyword(String id, String CID, String Name, String MNumber) {
		
		this.Empid=id;
		this.ClientEmpID=CID;
		this.EmpName= Name;
		this.EmpMobileNumber= MNumber;
		
	}
	 
	
	public  void displayEmpDetails() {
		
		System.out.println("Employee Details");
		System.out.println("Emp ID: " + Empid);
		System.out.println("Name: " + EmpName);
		System.out.println("Company Name: " + CompnayName);
		System.out.println("Client Name: " + ClientName);
		System.out.println("Work Location: " + Location);
		System.out.println("Client Location: " + ClientLocation);
		System.out.println("Client Emp ID: " + ClientEmpID);
		System.out.println("Emp Emergency Number: " + EmpMobileNumber);
	}
	
	// In Java, Static Method can't use Non static variable.
	public static void displayEmpAddree() {
		
		System.out.println("Your current address is " + Address);
		//Added non static variable (EMpid)
		//System.out.println(Empid);
	}
	
	
	
	
	public static void main(String[] args) {
		
		StaticKeyword SK = new StaticKeyword("CTS0402", "Aveva042", "Jitesh Ranjan","8142619916");
		SK.displayEmpDetails();
		StaticKeyword.Address ="Bandlaguda Jagir Suncity";
		StaticKeyword.displayEmpAddree();
		
		
	}

}
