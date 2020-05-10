package abstract_Interface;

public abstract class CalculatorMenu {	
	
	CalculatorMenu() {
		 System.out.println("Please wait while opening calculator");
	 }
	
	
	abstract double add(double ... Num);
	
	abstract float subtract(float ... Num);
	
	abstract float Multiplication(float ... Num);
	
	abstract double division(double Num1, double Num2);
	
	
	public void displayResult() {
		System.out.println("Result will be display here: ");
	}
	
	
	
	
	
	

}
