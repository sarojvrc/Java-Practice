package practice;

import java.util.Scanner;

public class SwitchCaseExample2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int no1 = sc.nextInt();
		System.out.print("Enter another num: ");
		int no2 = sc.nextInt();
		System.out.print("What you want to do(Add/Sub/Mult/Div): ");
		String method = sc.next();
		switch(method) {
		case Add:
			System.out.println("The addition of two nos is: "+no1+no2);
		}
	}
}
