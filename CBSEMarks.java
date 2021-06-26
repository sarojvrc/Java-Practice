package practice;

import java.util.Scanner;

public class CBSEMarks {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks in Math: ");
		int math = sc.nextInt();
		System.out.println("Enter your marks in Physics: ");
		int phy = sc.nextInt();
		System.out.println("Enter your marks in English: ");
		int eng = sc.nextInt();
		System.out.println("Enter your marks in IT: ");
		int it = sc.nextInt();
		System.out.println("Enter your marks in History: ");
		int his = sc.nextInt();
		
		int total = (math + phy + eng + it + his);
		float percentage = (float)total/5;
		
		System.out.println("Your total avg percentage is: " + percentage + " Percentage");
		
		if(percentage >= 60) {
			System.out.println("First Class");
		}else if(percentage >=45 && percentage < 60 ) {
			System.out.println("Second Class");
		}else if(percentage >= 30 && percentage < 45) {
			System.out.println("Third Class");
		}else {
			System.out.println("You are Fail. Work Hard");
		}
		
	}
}
