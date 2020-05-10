package abstract_Interface;

public class Calculator extends CalculatorMenu {
	
	Calculator(){
		super();
	}

	@Override
	double add(double... Num) {
		double sum=0;
		
		for(double x:Num) {
			
			sum=sum+x;
		}
		

		return sum;
	}

	@Override
	float subtract(float... Num) {
		float sum=0;
		
		for(float x:Num) {
			
			sum=x-sum;
		}
		
		return sum;
	}

	@Override
	float Multiplication(float... Num) {
		float sum=1;
		
		for(float x:Num) {
		
			sum=sum*x;
		}
		
		return sum;
	}

	@Override
	double division(double Num1, double Num2) {
		double result;
		
		result= Num1/Num2;

		return result;
	}

	
	public void displayAddResult(double... Num) {
		System.out.println("Result will be display here: ");
		double Result = add(Num);
		System.out.println("Sum is " + Result);
		System.out.println("==============================");
		
	}
	
	public void displaySubResult(float... Num) {
		System.out.println("Result will be display here: ");
		float Result = subtract(Num);
		System.out.println("subtract is " + Result);
		System.out.println("==============================");
		
	}
	
	public void displayMulResult(float... Num) {
		System.out.println("Result will be display here: ");
		double Result = Multiplication(Num);
		System.out.println("Multiplication is " + Result);
		System.out.println("==============================");
	}
	
	public void displayDivResult(double Num1, double Num2) {
		System.out.println("Result will be display here: ");
		double Result = division(Num1, Num2);
		System.out.println("Result is " + Result);
		System.out.println("==============================");
	}
	
}
