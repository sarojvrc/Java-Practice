package practice;

public class ReverseNumber2 {
	public static void main(String args[]) {
		int count = 11;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				count--;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}
}
