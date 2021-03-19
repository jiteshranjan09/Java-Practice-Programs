package javabasic;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "Hello";
		
		for (int i=0; i<message.length(); i++) {
			System.out.print(message.charAt(i+1));
		}
		
		
		  print(message); 
		  message += "World!"; 
		  print(message);
		 

	}

	private static void print(String message) {
		// TODO Auto-generated method stub
		System.out.print(message);
		message += " ";
		
	}

}

//hellohelloworld! 