package breakLabel;

public class BreakusingLabel {
	
	public static void main (String[] args) {
		
		// Break with loop name (Label)
		int i;
		First: for( i=0; i<5; i++) {
		
		
			Second: for(int j=0;j<=6; j++) {
				
				if (i==2  || j==2)
					break Second;
				System.out.println("J =" +j);
					//break Second;
			}
				System.out.println("I =" +i);
		}
			System.out.println("Out of all loop");
			
			Third: switch(i) {
			
			case 0:
				System.out.println(i);
				break;
			case 1:
				System.out.println(i);
			case 2:
				if(i==2)
					System.out.println("Switch");
				break Third;
				//break First; // Wrong : Becoz First label is not in same loop so we can't break here. (out of loop)
			default:
				System.out.println("Default");
			}
	}

}
