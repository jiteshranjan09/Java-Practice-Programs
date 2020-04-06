package inheritance;

public class ClassFee extends School {
	
	int SchoolFee;
	
	ClassFee(int num, int SM, int ClsFee){
		super(num,SM);
		super.SchoolFee = ClsFee;	
	}
	
	public int Fee() {	
		return SchoolFee+SchoolMaintance+200;	
	}
	
	public void displayFee() {
		int Price;
		Price = super.Fee();
		System.out.println("This is class Fee: " + Price);
	}
}
