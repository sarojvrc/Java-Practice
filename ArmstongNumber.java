package practice;

import java.util.Scanner;

public class ArmstongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no: ");
		int no = sc.nextInt();
		int t1 = no, leng=0 ;
		
		while(t1 != 0) {
			t1 = t1/10;
			leng = leng + 1;
		}
		
		int t2 = no; int rem, arm = 0;
		while(t2 != 0) {
			rem = t2/10;
			int mult = 1;
			for(int i =1; i<= leng; i++) {
				mult = mult * rem;
			}
			arm = arm + mult;
			t2 = t2/10;
		}
		
		if(no == arm) {
			System.out.println(no + " is a armstrong number");
		}else {
			System.out.println(no + " is not a armstrong number");
		}
	}

}
