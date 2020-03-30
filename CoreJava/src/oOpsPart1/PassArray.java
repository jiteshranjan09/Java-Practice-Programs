package oOpsPart1;

// Using VarArgs passing in method but in old approach

public class PassArray {
	
	static void vatest(int [] v) {
		
		System.out.println("Length of Pass Array is : " + v.length);
		
		for (int x:v) {
			System.out.println("Array Contains :" + x);
		}
		
	}
	
	public static void main(String[] args) {
		// As we pass V as Array in method so we can't pass the direct value in method. to remove this drawback
		// we use Varargs which is specified with (...) symbol & complier automatically under
		int n1[] = {1,2,1,5};
		int n3[] = {};
		vatest(n1);
		vatest(n3);
	}
}


