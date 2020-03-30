package oOpsPart1;

import java.util.Scanner;

class Outer{
	
	private int ax;
	int bx;
	static String s1;
	static String s2;
	protected Outer(int a, int b){
		this.ax= a;
		this.bx =b;
	}
	
	 int display(int ax, int bx) {
		int a =add(ax,bx);
		int b= sub(ax,bx);
		return a-b;
		
	}
	
	 int add(int ax, int bx) {
		return ax+bx;
	}
	 
	 int sub(int ax, int bx) {
		 return ax-bx;
	 }
	
	 static String getvalue() {
		 Scanner st1 = new Scanner(System.in);
		 return st1.next();
		 
	 }
	  static String dispaytext() {
		  String text = getvalue();
		return text;
		  
	  }
	  
	  class Inner{
		
		 int cx=5;
		  
		double div() {
			
			double dx =(add(ax,bx)/sub(ax, cx));
			return dx;	
		}
		
	  }
	
	
	
}
public class InnerClass1 {

	public static void main (String[] rgs) {
		
		Outer o = new Outer(15, 8);
		
		Outer.Inner in = o.new Inner();
	
		System.out.println(o.display(55, 66));
		double result = in.div();
		System.out.println(result);
	}
}
