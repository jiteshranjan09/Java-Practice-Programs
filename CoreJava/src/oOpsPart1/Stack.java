package oOpsPart1;

public class Stack {
	
	int stck[] = new int[10];
	int index;
	
	Stack() {
		index= -1;
	}
	
	void push(int item) {
		
		if (index>=9) {
			System.out.println("Stack is full");
		}
		else 
			stck[++index]= item;
	}
	
	int pop() {
		//int a =index;
		
		if (index<0) {
			System.out.println("Stack is Empty");
			return 0;
		}
		else 
			return stck[index--];
		
	}
	
	public static void main(String[] args) {
		
		Stack S1 = new Stack();
		Stack S2 = new Stack();
		
		for (int i=0; i<10; i++) {
			S1.push(i);
		}
		
		for (int i=10; i<20; i++) {
			S2.push(i);
		}
		
		for (int i=0; i<10; i++) {
			System.out.println(S1.pop());
		}
		
		
	}
	
}
