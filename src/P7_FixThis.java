/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 7. After you fixed the error, why is this an error? Note: do not just repeat Eclipse's error message,
 why did Eclipse have that error message?
 It was able to run for me with out error
 
 
 */

public class P7_FixThis {

	public static void main(String[] args) {
		numberPrinter(5);
		numberPrinterOdd(5);
	}

	private static void numberPrinter(int max) {
		for (int i = 1; i <= max; i++) {
			System.out.print("[" + i + "] ");
		}
		System.out.println();
		System.out.println();
	}	
	private static void numberPrinterOdd(int max) {
		for (int i = 1; i <= max; i=i+2) {
			System.out.print("[" + i + "] ");
		}
		System.out.println();
	}

}
