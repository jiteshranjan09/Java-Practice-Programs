package javabasic;

public class AccessModifier {
	
	//Instance variable -- define out side of method but inside a class
	public int a;
	private int b;
	int c;
	private int d, e;
	
	//local variable -- int k
	public void sum(int k ) {
		System.out.println(c);
		b=k;
		c=a+b;
		System.out.println(c);	
	}
	
	void Sub( int i, int j) {
		System.out.println(c);
		d=i;
		e=j;
		System.out.println(d-e);
	}

	
}
