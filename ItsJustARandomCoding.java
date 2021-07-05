package practice;

import java.util.Scanner;

public class ItsJustARandomCoding {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Cool!! Just enter your first name: ");
		String name = sc.next();
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		System.out.print("Enter your mobile num: ");
		long mob = sc.nextLong();
		if(age >= 18) {
			System.out.println("Great "+name+" You can drive now.");
			//System.out.println(" You can drive now.");
		}else {
			System.out.print("Ohh Man "+name+" You can't drive now, wait for 18. ");
			//System.out.print(" You can't drive now, wait for 18.");
		}
		//new
		System.out.println("Just apply a DL, you will get a OTP in "+mob+", then only you can drive. Cool");
		System.out.println("Just apply a DL, you will get a OTP in "+mob+", then only you can drive. Cool");
	}
}
