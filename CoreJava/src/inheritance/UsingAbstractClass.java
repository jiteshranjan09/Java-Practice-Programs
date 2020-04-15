package inheritance;



abstract class Demo{
		
		Object ob1, ob2;
		
		Demo(Object a1, Object a2){
			ob1=a1;
			ob2=a2;
		}
		
		abstract void swap();
		
		public void add(int a, int b) {
			
			System.out.println("Output is: :"+ a+b);
		}
		
	}
	
	class DemoTest extends Demo{
		Object ob3;
		
		DemoTest(Object a, Object b){
			super(a,b);
			
		}
		
		 void swap() {
			ob3=ob1;
			ob1=ob2;
			ob2=ob3;
			
			System.out.println("Value of Object 1 is: " + ob1);
			System.out.println("Value of Object 2 is: " + ob2);
		}
		
		
	}

	public class UsingAbstractClass {
		
		public static void main(String[] args) {
			DemoTest DT = new DemoTest(1, 6199);
			DT.swap();
			DT.add(1,8);
		}
		
		
	}
