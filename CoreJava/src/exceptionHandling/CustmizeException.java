package exceptionHandling;

@SuppressWarnings("serial")
class MyException extends Exception {
	private int details;
	MyException(int a){
		details =a ;
	}
	
	public String toString() {
		return "My Exception ["+ details +"]";
		
	}
	public String getMesage() {
		return "My Exception ["+ details +"]";
	}
}

public class CustmizeException  {
	
	static void compute(int a) throws MyException {
		System.out.println("Start");
		if (a>10) {
			System.out.println("value of a" + a);
			
			throw new MyException(a);
		//	System.out.println("Normal Pass");
		}
	}
	
	public static void main(String[] args) {
		try {
			compute(2);
			compute(20);
		}
		catch(MyException e) {
			System.out.println("Caught" + e);
			System.out.println(e.getMesage());
			System.out.println(e.getLocalizedMessage());
		}
		
	}
}