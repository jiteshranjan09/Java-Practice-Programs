package classObject;

public class ObjasParameter {
	
	
	double width, depth, height;
	
	ObjasParameter(double a, double b, double c){
		this.width=a;
		this.depth=b;
		this.height=c;
	}
	
	double vol() {
		System.out.print("Volume of box is :");
		System.out.println(width*depth*height);
		return width*depth*height;
	}
	
	ObjasParameter(int a) {
		this.width=a;
		this.depth=a;
		this.height=a;
	}
	
	double vol1() {
		System.out.print("Volume of box is :");
		System.out.println(width*depth*height);
		return width*depth*height;
	}
	
	//Passing object as parameter.
	
	void vol(ObjasParameter ob, ObjasParameter ob1) {
		
		if (ob.vol() == ob1.vol1()) {
			System.out.println("Matched");
			System.out.println("ob.Vol() =" + ob.vol());
			System.out.println("ob.Vol()1 =" + ob1.vol1());
		}
		else 
			System.out.println("Doesn't matches");
	}
	
	
	public static void main(String[] args) {
		
		ObjasParameter Ob1= new ObjasParameter(10);
		ObjasParameter Ob2= new ObjasParameter(11,10,10);
		Ob1.vol();
		Ob2.vol1();
		
		Ob1.vol(Ob1, Ob2);
		Ob2.vol(Ob1,Ob1);
	}

}
