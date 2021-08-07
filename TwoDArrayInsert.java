package practice;

import java.util.Scanner;

public class TwoDArrayInsert {
	
	//function for adding array elements
	static void InsertElement(int arr[][], int row, int col, Scanner sc) {
		System.out.println("Enter array elements");
		//for insert
		for(int i=0; i<row; i++) {
			for(int j=0;j<col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		//for print
		for(int i=0; i<row; i++) {
			for(int j=0;j<col; j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
	}
	
	//driver code
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size");
		int row = sc.nextInt();
		System.out.println("Enter the col size");
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
		//call the method to insert array elements
		TwoDArrayInsert.InsertElement(arr, row, col, sc);

	}

}
