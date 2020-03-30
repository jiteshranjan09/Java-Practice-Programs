package oOpsPart1;

class OuterClass {
	  int x = 10;
	  
	  int add(int a, int b) {
		  return a+b;
	  }

	  class InnerClass {
	    int y = 5;  // Instance variable of Inner class so it will not access to outer class.
	    int c =add(x,y);
	}
}

	public  class InnerLoop {
	  public static void main(String[] args) {
	    OuterClass myOuter = new OuterClass();
	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
	    System.out.println(myInner.y + myOuter.x);
	    System.out.println(myInner.c);
	   // System.out.println(myOuter.y);
	    
	  }
	}
