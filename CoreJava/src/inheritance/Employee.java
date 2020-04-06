package inheritance;

public class Employee extends MemberAccess {
	
	String EmpName;
	private int EmpSalary;
	protected long EmpID;
	String EmpDis;
	
		
	void displayEmployeeDetails() {
		
		System.out.println("Employee Associate with: " + CompanyName);
		System.out.println("Employee Name is: " + EmpName);
		System.out.println("Employee Id: " + EmpID);
		System.out.println("Employee holding a : " + Asset);
		System.out.println("Employee Current Salary is: " + EmpSalary);
		System.out.println("Employee Dis: " + EmpDis);
		//Trying to access private member for super class
		//System.out.println("Company Account no is: " + CompanyAcount);
	}
	
	public static void main(String[] args) {
		
		Employee Emp = new Employee();
		
		MemberAccess MA = new MemberAccess();
		
		Emp.CompanyName ="CTS";
		Emp.EmpName="Jitesh Ranjan";
		Emp.EmpID = 826632;
		Emp.EmpDis ="Associate";
		Emp.Asset="Office desktop";
		Emp.EmpSalary= 950000;
		
		
		Emp.displayEmployeeDetails();
		
		//Assigning Emp reference variable to Member access class.
		MA=Emp;
		
		MA.getdetails("Cognizant","LOB3", "Laptop");
		MA.displaydetails();
		
		//Now SuperClass trying to Access Subclass variable & method but 
		// It will give compile time error as Super class can only access which is defined inside super class 
		//MA.EmpName = "Hello";
		//MA.displayEmployeeDetails();
		
		
	}

}
