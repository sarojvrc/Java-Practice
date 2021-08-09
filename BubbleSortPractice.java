package practice;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortPractice {
	
	//function to sort using bubble sort
	static void Sort(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j+1]<arr[j]) {
					int temp = arr[j+1];
					arr[j+1]= arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Array after sort "+Arrays.toString(arr));
	}
	
	//driver code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Array is "+Arrays.toString(arr));
		
		//call the sort function
		
		BubbleSortPractice.Sort(arr);
	}

}
