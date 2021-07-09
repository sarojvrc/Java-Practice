package practice;

import java.util.Scanner;

public class CharLetterNumberCount {

	//@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line: ");
		String line = sc.nextLine();
		int letter=0, digit = 0, others=0, space=0;
		char ch[] = line.toCharArray();
		for(int i=0; i<line.length(); i++) {
			if(Character.isDigit(ch[i])) {
				digit++;
			}else if(Character.isLetter(ch[i])) {
				letter++;
			}else if(Character.isSpaceChar(ch[i])) {
				space++;
			}else {
				others++;
			}
		}
		System.out.println("Total no of Letters : "+letter);
		System.out.println("Total no of Digits : "+digit);
		System.out.println("Total no of Space : "+space);
		System.out.println("Total no of Other : "+others);
	}

}
