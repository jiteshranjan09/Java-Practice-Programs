package different_type_of_ForLoop;

public class ForEach {
	
	public static void main (String arg[]) {
		
		int Num[] = {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for (int x : Num) {
			sum+=x;
			System.out.println(sum);
		}
		
		String a[] = {"Jitesh", "Ranjan", "Associate"};
		
		for (String x : a) {
			System.out.println(x);
		} 
	}

}
