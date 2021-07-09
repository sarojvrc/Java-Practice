package practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		char[] str = sc.nextLine().toCharArray();
		//System.out.println("Reverse is below");
		for(int i = str.length-1; i>=0; i--) {
			System.out.print(str[i]);
		}
		//System.out.println();

	}

}
