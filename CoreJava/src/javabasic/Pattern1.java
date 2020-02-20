
/*	0
 * 	0  1
 * 	0  2  4
 *  0  3  6   9
 *  0  4  8   12  16
 *  0  5  10  15  20   25
 *  0  6  12  18  24   30  36
 *
 */

package javabasic;

public class Pattern1 {

	public static void main(String[] args) {

		for (int i = 0; i < 7; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("   " + i * j);
			}
			System.out.println("");
		}
		
		//Same pattern using continue:
		
		//outer: for(int k=0; k++)
	}

}





