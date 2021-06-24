package practice;
import java.util.Scanner;

//import com.sun.java_cup.internal.runtime.Scanner;

public class UserInputVotorCalculator {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age ");
		int age = sc.nextInt();
		if(age >= 18 && age <=100 ) {
			System.out.println("You can now vote!!");
		}else if(age > 100){
			System.out.println("Wow!! You are a miracle. 100 plus years. Great. ha ha ");
		} else {
			System.out.println("You are not eligile for vote.");
		}
		
	}
}
