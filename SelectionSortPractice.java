package practice;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortPractice {
	
	//function to sort
	static void SelectionSort(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			int min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			if(min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
	
	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The array is "+Arrays.toString(arr));
		
		//call the method for selection sort
		SelectionSortPractice.SelectionSort(arr);
		System.out.println("After sort "+Arrays.toString(arr));

	}

}
