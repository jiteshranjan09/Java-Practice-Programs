package abstract_Interface;

import java.util.Scanner;

public class Phone extends AdvanceCalculator implements SmartPhone, BasicPhone  {

	@Override
	public void call() {
		System.out.println("Calling to..." + Phn_No);	
		space();
	}

	@Override
	public void Radio() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Channel No");
		int Ch = sc.nextInt();
		switch (Ch) {
		case 1:
			System.out.println("you are Listening " + Channel1 );
			break;
		case 2:
			System.out.println("you are Listening " + Channel2 );
			break;
		case 3:
			System.out.println("you are Listening " + Channel3 );
			break;
		default:
			System.out.println("Your radio has some proble");
		
		}
		space();
	}

	

	@Override
	public void contact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Contact no");
		int Ch = sc.nextInt();
		System.out.println("Please Enter Contact Name");
		String S = sc.next();
		System.out.println("Saving.....");
		System.out.println("Contact Name = " + S);
		System.out.println("Contact Phone Number  =" + Ch);
		space();
	}

	@Override
	public void messages() {
		System.out.println("You have new message");
		System.out.println("Thanks for reading this Message");
		space();
	}

	@Override
	public void camera() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter camera no");
		int Cam = sc.nextInt();
		switch (Cam) {
		case 1:
			System.out.println("You are using " + cam1);
			break;
		case 2:
			System.out.println("You are using " + Cam2);
			break;
		default:
			System.out.println("No Camera");
		}
		space();
	}

	@Override
	public void phoneLock() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Security type");
		int lock = sc.nextInt();
		switch (lock) {
		case 1:
			System.out.println("You are using " + Phn_Security1);
			break;
		case 2:
			System.out.println("You are using " + Phn_Security2);
			break;
		case 3:
			System.out.println("You are using " + Phn_Security3);
			break;
		default:
			System.out.println("None");
		}
		space();
	}

	@Override
	public void about() {
		System.out.println("Displaying About.......");
		space();
	}
	
	public void space() {
		System.out.println("=================================================");
	}


}
