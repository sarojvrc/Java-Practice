package practice;

import java.util.Scanner;

public class SwapTwoInteger {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no: ");
		int no1 = sc.nextInt();
		System.out.println("Enter the second no: ");
		int no2 = sc.nextInt();
		
		int temp = no1;
		no1 = no2;
		no2 = temp;
		
		System.out.println("Swap no are " + no1 + " " + no2);
	}
}
