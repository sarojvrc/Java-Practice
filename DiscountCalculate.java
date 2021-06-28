package practice;
import java.util.Scanner;

public class DiscountCalculate {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the MRP of the Saree: ");
		int sareeMRP = sc.nextInt();
		System.out.println("Enter the selling price of Saree: ");
		int sareePrice = sc.nextInt();
		System.out.println("Enter the no of Saree you want to buy: ");
		int sareeNo = sc.nextInt();
		
		int totalSareeMRP = sareeMRP * sareeNo;
		int totalSellingPrice = sareePrice * sareeNo;
		int discount = (totalSareeMRP-totalSellingPrice)/100;
		
		System.out.println("You bought total " + sareeNo +" no of Saree(s)");
		System.out.println("Your total amount is " + totalSellingPrice);
		System.out.println("You got a discount of " + discount +" %");
	}
}
