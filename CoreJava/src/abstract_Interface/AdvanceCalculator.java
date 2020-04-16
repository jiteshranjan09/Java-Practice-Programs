package abstract_Interface;

public class AdvanceCalculator extends Calculator implements CalcAdvanceOption {

	@Override
	public void squareroot(int num) {
		
		int result = num*num;
		
		System.out.println("Square root of " + "num" +" is: " + result);
		
	}

}
