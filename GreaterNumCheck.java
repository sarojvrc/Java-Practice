package practice;
import java.util.*;

public class GreaterNumCheck {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int firstNum = sc.nextInt();
		System.out.println("Enter the second number: ");
		int secondNum = sc.nextInt();
		
		if(firstNum > secondNum) {
			System.out.println(firstNum + " is greater than " + secondNum);
		}  else if(secondNum > firstNum) {
			System.out.println(secondNum + " is greater then " + firstNum);
		} else {
			System.out.println(firstNum + " and " + secondNum + " both are same");
		}
		
	}
}
