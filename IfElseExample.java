package practice;

import java.util.Scanner;

public class IfElseExample {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age= sc.nextInt();
		System.out.print("At what age you are going to be retired: ");
		int retire = sc.nextInt();
		int remAge = retire - age;
		if(remAge >= 30) {
			System.out.println("You have still "+remAge+" years to retired, enjoy now..");
		}else if(remAge>=10) {
			System.out.println("You have "+remAge+" years left for retired. Focus on your job and save some Money");
		} else {
			System.out.println("You have only "+remAge+" age to retired. Word hard..");
		}
	}
}
