package practice;

public class NumberReversePrint {
	public static void main(String args[]) {
		int count = 11;
		for(int i=1; i<=4; i++) {
			for(int j=4; j>=i; j--) {
				count--;
				System.out.print(count + " ");
			}
			System.out.println();
		}
	}
}
