package practice;

import java.util.Scanner;

public class CalculatorSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no: ");
		int no1 = sc.nextInt();
		System.out.println("Enter 2nd no: ");
		int no2 = sc.nextInt();
		System.out.println("Enter a methode: eg Add/Mult/Div/Sub: ");
		String cal = sc.next();
		
		switch(cal) {
		case "Add":
			int add = no1 + no2;
			System.out.println("The addition of "+no1+" and "+no2+" is "+add);
			break;
		case "Mult":
			int mult = no1 * no2;
			System.out.println("The mult of "+no1+" and "+no2+" is "+mult);
			break;
		case "Div":
			float div = (float)no1 / no2;
			System.out.println("The div of "+no1+" and "+no2+" is "+div);
			break;
		case "Sub":
			int sub = no1 - no2;
			System.out.println("The sub of "+no1+" and "+no2+" is "+sub);
			break;
		default:
			System.out.println("You entered wrong input. Try again");
		}
	}

}
