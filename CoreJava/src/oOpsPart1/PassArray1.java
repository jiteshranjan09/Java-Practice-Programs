package oOpsPart1;

//This is new approach to define length of arugment by using (...) 
//Syntax tells complier that method can accept zero or more no of arugments.
//the variable implicitly defined as array.
//Methods can have normal parameter along varargs (but vararg must be last)
// Method should have only one varargs (should not have multiple in single method)
public class PassArray1 {
	
	void vatest(int ...v) {
		
		System.out.println("Length of Pass Array is : " + v.length);
		
		for (int x:v) {
			System.out.println("Array Contains :" + x);
		}
		
	}
	
	static void vatest(String test, double D, String ...str) {
		
		System.out.println("Length of Pass Array is : " + str.length);
		
		for (String x:str) {
			System.out.println("Array Contains :" + x);
			System.out.println("Adding all paramets: " + test + str + D);
		}
		
	
	}
		public static void main(String[] args) {
			
			PassArray1 PA = new PassArray1();
			
			PA.vatest(10,20,30,40);
			PA.vatest();
			PA.vatest(10,44);
			
			vatest("This is Java", 8 , "Hello", "Bye");
		}
}
