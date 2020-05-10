package abstract_Interface;

public class OnePlus {

	public static void main(String[] args) {
		
		Phone ph = new Phone();
		ph.call();
		ph.camera();
		ph.contact();
		ph.phoneLock();
		ph.Radio();
		ph.messages();
		ph.about();
		ph.cube(10);
		ph.reset("LockDown");
		BasicPhone.IMIENumber();
		SmartPhone.getsignalStatus();

	}

}
