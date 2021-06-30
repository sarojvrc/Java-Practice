package practice;

import java.util.Scanner;

public class Mult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no: ");
		int n = sc.nextInt();
		System.out.println("Enter the ending point: ");
		int end = sc.nextInt();
		
		for(int i=1; i<=end; i++) {
			System.out.println("Mult is "+i+" and "+n+" is "+i*n);
		}
	}

}
