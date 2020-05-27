package exceptionHandling;

public class Throwsandthrow {

	 static void demo() {
		 try {
		System.out.println("above exception");
		throw new NullPointerException("hello");
		 }
		 catch(NullPointerException e) {
			 System.out.println("Exception caugth in demo" + e);
			 throw e;
		 }
	}
	
	
	
	
	
	public static void main(String[] args) {
		try {
		demo();
	}
		catch(NullPointerException e) {
			System.out.println("Recaught: " + e);
		}

}
}
