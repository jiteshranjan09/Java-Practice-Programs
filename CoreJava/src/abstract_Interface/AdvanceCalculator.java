package abstract_Interface;

public class AdvanceCalculator extends Calculator implements CalcAdvanceOption {
	
	int Radius;
	double Area;
	
	@Override
	public void square(int num) {
		
		int result = num*num;	
		System.out.println("Square root of " + "num" +" is: " + result);
		
	}
	
	public void circuleArea(int Radius) {
		
		Area = pi*Radius;
		System.out.println(" Area of Circle is " + Area);
	}

	@Override
	public void cube(int num) {
		int result = num*num*num;
		
		System.out.println("Square root of " + "num" +" is: " + result);
	}

}
