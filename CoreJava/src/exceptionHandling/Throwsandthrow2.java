package exceptionHandling;

public class Throwsandthrow2 {

	 static void demo() throws IllegalAccessException {
		System.out.println("above exception");
		throw new IllegalAccessException("hello");
		 
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		try {
			demo();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
