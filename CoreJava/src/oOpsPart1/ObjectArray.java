

// As static array can store only one type of date (means either int or String) -- to cover come this problem ObjectArray comes in picture.

package oOpsPart1;

import java.util.Scanner;

public class ObjectArray {
	 Object ob[];
	 ObjectArray(int i) {
		
		  ob = new Object[i];
	}
	
	 public void getUserInput() {
		 
		 for(int i=0; i<ob.length; i++) {
			 System.out.println("PLease enter your input");
			 @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			 String UserInput=sc.next();
			 ob[i] = UserInput;
		 }
	 }
	 
	public void displaydate() {
		Object Displayvalue[] = new Object[ob.length];
		for (int i =0 ; i<ob.length; i++) {
		
			//System.out.println(ob[i]);
			
			Displayvalue[i]=ob[i];
			//System.out.println(Displayvalue[i]);
		}
		
		System.out.println(ob.length);
		System.out.println(Displayvalue[4]);
	}
	
	public static void main(String[] args) {
		ObjectArray oa = new ObjectArray(5);
		oa.getUserInput();
		oa.displaydate();
	}
}
