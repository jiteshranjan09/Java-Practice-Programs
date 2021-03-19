package interviewquestion;

public class ReverseaNumber {
	
	public static long revert(long number) {
		
		long revertnumber=0;
		
		while(number!=0) {
			revertnumber = (revertnumber*10)+(number%10);
			number=number/10;
		}
		return revertnumber;
	}
	
	public static void main(String[] args) {
		long lnum = 654321;
		long a= revert(lnum);
		System.out.println(a);
	}

}
