package javabasic;

public class AccessTest {

	public static void main(String[] args) {
		AccessModifier AM = new AccessModifier();
		//AM.b=10; -- Can't access the private variable outside of class but can pass the value through method parameter
		AM.a=10;
		AM.c=30;
		AM.sum(10);
		AM.Sub(9, 9);

	}

}
