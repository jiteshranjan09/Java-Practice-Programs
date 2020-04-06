package inheritance;

public class SchoolandStudentDetials {

	public static void main(String[] args) {
		
		Student S1 = new Student("RPS", "Darbhanga", "Komal Roy", "CBS", 
				 "Lucky Singh", "Lala Rajput Roy" , "Laheriasarai",99,3);
		S1.displayStudentDetails();
		ClassFee F1 = new ClassFee(10, 500, 5000);
		F1.displayFee();
		
	}

}
