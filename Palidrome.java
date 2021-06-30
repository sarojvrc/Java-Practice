package practice;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no: ");
		int no = sc.nextInt();
		int temp = no;
		int rem = 0, rev=0;
		
		while(temp != 0) {
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		if(no == rev) {
			System.out.println(no +" is a Palindrome number");
		} else {
			System.out.println(no +" is not a Palindrome number");
		}
	}

}
