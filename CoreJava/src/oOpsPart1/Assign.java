package oOpsPart1;

public class Assign extends AssigningObjectReferenceVariable{
	

	 public static void main(String[] args) {
		
		 AssigningObjectReferenceVariable A1 = new AssigningObjectReferenceVariable();
		 AssigningObjectReferenceVariable A2 = A1;
		 
		 A1.width=100;
		 A1.depth=100;
		 A1.height=80;
		 A2.height=100;
		 A2.width=0;
		 
		 System.out.println(A1.width*A1.depth*A2.height);
		 System.out.println(A1.height);
		 System.out.println(A2.width);
		 
		 
		 AssigningObjectReferenceVariable box1 = new AssigningObjectReferenceVariable();
		 AssigningObjectReferenceVariable box2 = new AssigningObjectReferenceVariable();
		 
		 box1.depth=10;
		 box1.width=10;
		 box1.height=10;
		 
		 box2.depth=100;
		 box2.width=180;
		 box2.height=110;
		 
		 box1.volume();
		 box2.volume();
	}

}
