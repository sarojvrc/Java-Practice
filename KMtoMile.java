package practice;

import java.util.Scanner;

public class KMtoMile {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your KM: ");
		int km = sc.nextInt();
		float mile = (float)(km *0.6214);
		
		System.out.println("Your KM is "+ km + " and your converted mile is: " + mile);
	}
}
