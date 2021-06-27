package practice;

import java.util.Scanner;

public class IncomeTaxCalculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your amount: ");
		int amount = sc.nextInt();
		
		if(amount >= 250000 && amount <= 500000) {
			float tax = (float) (0.05f *(amount - 250000));
			System.out.println("Your tax amount is: " + tax);
		} else if(amount >= 500000 && amount <= 700000){
			float tax = (float) (0.20f *(amount - 500000));
			System.out.println("Your tax amount is: " + tax);
		} else if(amount >= 700000 && amount <= 1000000) {
			float tax = (float) (0.30f *(amount - 700000));
			System.out.println("Your tax amount is: " + tax);
		} else if(amount > 1000000){
			float tax = (float) (0.40f *(amount - 1000000));
			System.out.println("Your tax amount is: " + tax);
		}else {
			System.out.println("Your tax amount is: 0000");
		}
	}
}
