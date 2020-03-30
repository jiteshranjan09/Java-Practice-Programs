package oOpsPart1;

import java.util.Scanner;

public class StringT {
	
	public static void main(String[] args) {
		
		String s1 = "Hello I love ";
		String s2 = "Hello I hate ";
		String s3;
		
		Scanner sc = new Scanner (System.in);
		String s4= sc.next();
		s3 = s1+ s4;
		
		if(s3.equalsIgnoreCase("Hello I Love Java")) {
			System.out.println("Java is one of the famous programming language");
		}
		else 
			System.out.println(s3.charAt(1));
		
		
	}

}
