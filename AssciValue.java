package practice;

import java.util.Scanner;

public class AssciValue {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a char: ");
		char chr = sc.next().charAt(0);
		int aski = chr;
		//System.out.println("The "+chr+" ascii value is "+aski);
		System.out.println("The ASCII value of "+chr+" is "+aski);
		
	}

}
