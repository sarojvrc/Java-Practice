package practice;

import java.util.Scanner;

public class WebsiteCountryCheck {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String website = sc.nextLine();
		if(website.contains("com")) {
			System.out.println("Commercial website");
		}else if(website.contains("org")) {
			System.out.println("Organisation website");
		}else if(website.contains("in")) {
			System.out.println("Indian website");
		}else {
			System.out.println("Different website");
		}
	}
}
