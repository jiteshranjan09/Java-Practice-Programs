package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryBlock {

	public static void main(String[] args) {


		try {
			
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			
			int b = 8/a;
			
			System.out.println("value of " + b);
			
			try {
				if (a==1) 
					 a=a/(a-a);
					 System.out.println("value of " + a);
					 if(a==2) {
						 int c[] = {1};
						 c[42] = 99;
					 }
			}
				catch (ArrayIndexOutOfBoundsException e) {
					System.out.println(e);
				}
				
			}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		catch (InputMismatchException e) {
			System.out.println(e);
		}
		}

	}


