package exceptionHandling;


public class FinallyBlock {

	static void demoA() {
		try {
			System.out.println("Executing DemoA Method");
			//int b = a/a;
			//System.out.println("Print the value of b");
			throw new NullPointerException("Demo");
		}
		catch(NullPointerException e) {
			System.out.println("Exception is " + e);
		}
		finally {
			System.out.println("Closing the method DemoA");
		}
	}

	static int demoB() {
		try {
			int b = 8/4;
			return b;
		}
		finally {
			System.out.println("Closing the method DemoB");
		}
	}

	static void demoC() {
		try {
			int C = 8/4;
			System.out.println("value of C " + C);
		}
		finally {
			System.out.println("Closing the method Democ");
		}
	}

	public static void main (String[] args) {
		try {
			demoA();
		}
		catch(NullPointerException e) {
			System.out.println("Recaught " +e);
		}
		int b =demoB();
		System.out.println("Value of B is " +b);
		demoC();
	}
}
