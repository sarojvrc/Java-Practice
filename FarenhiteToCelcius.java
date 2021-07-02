package practice;

import java.util.Scanner;

public class FarenhiteToCelcius {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temparature in Farenhite: ");
		int Farenhite = sc.nextInt();
		float Celcius =(float)((Farenhite - 32) * 0.5556);
		System.out.println("Your converted Farenhite "+Farenhite+" to Celcius is "+Celcius);
	}
}
