package abstract_Interface;

public interface BasicPhone {

	String Phn_No = "8142619916";
	String Channel1 = "RedFM";
	String Channel2 = "RadioMirchi";
	String Channel3 = "LoveGuru";
	
	public void call();
	public void Radio();
	public void contact();
	public void messages();
	
	//Interface can have default method like class with the Keyword "Default"

	default void reset(String s) {
		
		switch (s) {
		case "Switch off":
			System.out.println("Turning off.....");
			break;
		case "Restart":
			System.out.println("Turning off.....");
			System.out.println("Starting the applications");
			break;
		default:
			System.out.println("Power button is not working");
			
		}
		
	}
	
	static void IMIENumber() {
		
		System.out.println("IMIE Number is 091887879" );
	}

}
