package abstract_Interface;

public interface SmartPhone extends  CalcAdvanceOption, BasicPhone {
	String cam1 = "ForntCamera";
	String Cam2 = "BackCamera";
	
	String Phn_Security1 = "Pin";
	String Phn_Security2 = "Pattern";
	String Phn_Security3 = "Password";
	
	public void camera();
	public void phoneLock();
	public void about();
	
	default void reset(String s) {
		
		if(s.equalsIgnoreCase("Switch Off") || s.equalsIgnoreCase("Restart")) {
			//Way to call super interface default method
			BasicPhone.super.reset(s);
		}
		
		else if (s.equalsIgnoreCase("LockDown")) {
			System.out.println("Phone is locked... ");
		}
		else if (s.equalsIgnoreCase("Snap")) {
			System.out.println("Captured... ");
		}
		else
			System.out.println("Nothing i have to do");
			
		}
	
	static void getsignalStatus() {
		
		System.out.println("Good");
	}
}
