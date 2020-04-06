package inheritance;

public class MemberAccess {

	String CompanyName;
	private String CompanyAcount;
	protected String Asset;
	
	void getdetails(String CN, String CA, String A) {
		CompanyName = CN;
		CompanyAcount = CA;
		Asset = A;
	}
	
	void displaydetails() {
		System.out.println("Company Name is: " + CompanyName);
		System.out.println("Company Account is: " + CompanyAcount);
		System.out.println("Company Assets is: " + CompanyName);
		
	}
		
}

