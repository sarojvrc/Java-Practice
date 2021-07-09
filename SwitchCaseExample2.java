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
		case "Add":
			int add = no1+no2;
			System.out.println("The addition of two nos is: "+ add);
			break;
		case "Div":
			float div = (float)(no1/no2);
			System.out.println("The division of two nos is: "+div);
			break;
		case "Mult":
			int mult = no1*no2;
			System.out.println("The multiplication of two nos is: "+mult);
			break;
		case "Sub":
			int sub = no1-no2;
			System.out.println("The substraction of two nos is: "+sub);
			break;
						
		}
	}
}
