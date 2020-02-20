package javabasic;



public class PrimeNoCheckUsingForLoop {
	
	public static void main (String arg[]) {
		
		int num=92;
		boolean Isprime;
		
		//Scanner sc = new Scanner(System.in);
		//num = sc.nextInt();
		
		if (num<2) {
			Isprime = false;
		}
		else 
			Isprime = true;
		
		for (int i=2; i<num/i; i++) {
			if (num % 2 == 0) {
				
				Isprime = false;
				break;
			}
		}
		
		if(Isprime)
			System.out.println("Num is a prime number");
		else
			System.out.println("Num is not a prime");
		
		
	}
}
