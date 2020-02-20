package different_type_of_ForLoop;

import java.util.function.IntUnaryOperator;

public class ForLoopUsingComma {

	public static void main(String[] args) {
		
		int a , b;
		
		for (a=1,b=99; a<b; a++, b--) {
			
			System.out.println("A is " +a);
			System.out.println("B is " +b);
		}
		
		boolean done=false;
		/*
		 * for (int i=0; !done ; i++) { System.out.println("Print " +i); }
		 */
	
	int j=0;
	for (;!done; ) {
		System.out.println("j is" +j);
		if (j==10) {
			done=true;
		}
		j++;
		
	}
	


}
}
