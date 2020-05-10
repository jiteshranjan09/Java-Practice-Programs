package abstract_Interface;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		
		calc.displayAddResult(1,4,2,1,5);
		calc.displayAddResult(9.5,0.5);
		
		calc.displayMulResult(12,15,20);
		calc.displayMulResult(5);
		calc.displayMulResult();
		
		
		calc.displayDivResult(10, 10);
		calc.displayDivResult(10,0);
		calc.displayDivResult(15, 12);
		calc.displayDivResult(0,5);
		
		calc.displaySubResult(4,5,1,4,5);
		calc.displaySubResult(4,5);
		
		AdvanceCalculator ACalc = new AdvanceCalculator();
		
		ACalc.square(10);
		
		double Test =ACalc.add(1,4,2,1,5);
		System.out.println(Test);
		
		ACalc.circuleArea(10);
		
		//Accessing implementation using interface ref.
		//By Doing this it is increasing security 
		//Ref. variable only can access those method which is defined in interface
		// Not able to access concreate class Method.
		
		CalcAdvanceOption Calc =new AdvanceCalculator();
		
		Calc.square(50);
		
		// Calc.circuleArea(10); Can't access by Calc reference 
		
	
		
		
		

	}

}
