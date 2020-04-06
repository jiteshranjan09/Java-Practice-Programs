package inheritance;

class A{
	
	void callme() {
		System.out.println("Inside A's Call");
	}
}

class B extends A{
	
	void callme() {
		System.out.println("Inside B's Call");
	}
	
}

class C extends A{
	
	void callme() {
		System.out.println("Inside C's Call");
	}
	
}

public class DynamicMehodDispatch{
	
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		A r;
		
		r=a;
		r.callme();
		a.callme();
		
		a=b;
		a.callme();
		
		r=c;
		r.callme();
	
		
	}
	
}