package oOpsPart1;

public class PassArray2 {
	
	//Will see the varargs overloading & its drawback.
	
	static void vartest(int ...v) {
		System.out.println("Length of Pass Array is : " + v.length);
		
		for (int x:v) {
			System.out.println("Array Contains :" + x);
		}
	}
	
	static void vartest(double ...v) {
		System.out.println("Length of Pass Array is : " + v.length);
		
		for (double x:v) {
			System.out.println("Array Contains :" + x);
		}
	}
	
	static void vartest(boolean ...v) {
		System.out.println("Length of Pass Array is : " + v.length);
		
		for (boolean x:v) {
			System.out.println("Array Contains :" + x);
		}
	}
	
	static void vartest(float ...v) {
		System.out.println("Length of Pass Array is : " + v.length);
		
		for (float x:v) {
			System.out.println("Array Contains :" + x);
		}
	}
	
	static void vartest(String ...v) {
		System.out.println("Length of Pass Array is : " + v.length);
		
		for (String x:v) {
			System.out.println("Array Contains :" + x);
		}
	}
	
	public static void main(String[] args) {
		vartest(1.0225,1.25,86.587);
		vartest(true,false);
		vartest(2,3,4,5,7,7);
		vartest("Jitesh", "Ranjan", "Is", "Learning", "java");
		vartest(1.1,20.1);
		
		/** this is the drawback when we overloading in vararg then complier get confuse 
		 * which method it should called when zero argument pass in method.
		 */
		// vartest(); 
	}

}
