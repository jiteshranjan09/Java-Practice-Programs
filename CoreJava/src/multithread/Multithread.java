package multithread;

 class hi extends Thread {
	
	public void run() {
		for(int i=0; i<=5; i++) {
		System.out.println("hi");
		}
	}
	
	
}

 class hello extends Thread {
	
	 public void run() {
			for(int i=0; i<=5; i++) {
			System.out.println("Hello");
			}
		}
}
 
 public class Multithread{
	 
	 public static void main(String[] args) {
		 hi m = new hi();
		 hello h = new hello();
		 m.start();
		 h.start();
		 
	}
	 
 }