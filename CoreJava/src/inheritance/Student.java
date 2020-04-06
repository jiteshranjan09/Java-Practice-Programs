package inheritance;

public class Student extends School {
	
	String StudentName;
	int RollNumber;
	String StudentFaterName;
	String StudentAddress;
	int Standard;
	int SchoolFee;

	Student(String SN, String SL, String SP,  String ST,  String StN, String SFN, String SA,int RNum, int Stard) {
		super(SN,SL,SP,ST);
		StudentName = StN;
		StudentFaterName = SFN;
		StudentAddress = SA;
		super.Standard = Stard;
		RollNumber=RNum;
	}
	
	
	public void displayStudentDetails() {
		String SchoolTiming;
		System.out.println("Below are the Student Details");
		System.out.println("Student Name is: " + StudentName);
		System.out.println("Student RollNumber is: " + RollNumber);
		System.out.println("Student Father's Name is: " + StudentFaterName);
		System.out.println("Student Staying in: " + StudentAddress);
		System.out.println("Student Study in: " + super.Standard);
		System.out.println("Below are the School Details");
		System.out.println("School Name is: " + SchoolName);
		System.out.println("School Principal Name is: " + SchoolPricipal);
		System.out.println("School Location is: " + SchoolLocation);
		//System.out.println("Number of Teachers present in School:  "+ NoofTeacher);
		System.out.println("School Type is: " + SchoolType);
		SchoolTiming = super.SchoolTimming(Standard);
		System.out.println("School Timing is " + SchoolTiming);
	}
	

}
