package practice;

import java.util.Arrays;

public class MergeSort {
	//function to sort the array
	static void Sort(int arr[], int li, int ui, int mid) {
		int i = li;
		int j = mid + 1;
		int k = li;
		int newarr[] = new int[arr.length];
		while(i <= mid && j <= ui) {
			if(arr[i]<= arr[j]) {
				newarr[k] = arr[i];
				i++;
			}else {
				newarr[k] = arr[j];
				j++;
			}
			k++;
		} //while ends here
		if(i>mid) {
			while(j<=ui) {
				newarr[k] = arr[j];
				k++; j++;
			}
		}else {
			while(i<=mid) {
				newarr[k] = arr[i];
				k++; i++;
			}
		}
		
		for(k=li; k<= ui; k++) {
			arr[k] = newarr[k];
		}
	}

	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,87,12,4,98,3,45,74,6,14,2,1,48,45,1,452,14,95,15};
		System.out.println("Array before sort "+Arrays.toString(arr));
		int li = 0; //li means lower index which
		int ui = arr.length-1; //ui means upper index
		int mid = (li+ui)/2;
		
		//call mergesort
		MergeSort.Sort(arr, li, ui, mid);
		System.out.println("Array after sorting "+Arrays.toString(arr));

	}

}
