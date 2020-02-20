package oOpsPart1;


public class CopyConstructor {

	
	double width, depth, height;
	
	CopyConstructor() {
		width=depth=height =-1;
	}
	
	CopyConstructor(double a, double b, double c){
		this.width=a;
		this.depth=b;
		this.height=c;
	}
	
	CopyConstructor(int a){
		width=depth=height =a;
	}
	
	
	CopyConstructor(CopyConstructor C){
		this.width=C.width;
		this.depth=C.depth;
		this.height=C.height;
	}
	
	public void volume() {
		System.out.print("Volume of box is :");
		System.out.println(width*depth*height);
	}
	
	public static void main(String[] args) {
		
		CopyConstructor CC1 = new CopyConstructor();
		CopyConstructor CC2 = new CopyConstructor(11.5,55.5,6);
		CopyConstructor CC3 = new CopyConstructor(5);
		//This is called as copy constructor 
		CopyConstructor CC4 = new CopyConstructor(CC2);
		CC2.volume();
		CC4.volume();
		CC1.volume();
		CC3.volume();
	}
 
}
