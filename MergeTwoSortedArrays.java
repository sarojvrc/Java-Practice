package practice;

import java.util.Arrays;

public class MergeTwoSortedArrays {
	//function for simple merging 
	static void Merge(int arr1[], int arr2[], int size1, int size2) {
		int newsize = size1 + size2;
		int newarr[] = new int[newsize];
		int i=0, j=0, k=0;
		while(i<= size1 && j<= size2) {
			if(arr1[i]<arr2[j]) {
				newarr[k++] = arr1[i++];
			}else {
				newarr[k++] = arr2[j++];
			}
		}
		for(; i<= size1; i++) {
			newarr[k++] = arr1[i];
		}
		for(; j<=size2; j++) {
			newarr[k++] = arr2[j];
		}
		System.out.println("New array is "+Arrays.toString(newarr));
	}

	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,8,14,19,45,52,65,74,85,98};
		int arr2[] = {2,5,13,15,41,51,60,71,81,91};
		int size1 = arr1.length;
		int size2 = arr2.length;
		
		System.out.println("Array 1 is "+Arrays.toString(arr1));
		System.out.println("Array 2 is "+Arrays.toString(arr2));
		
		//call the method
		MergeTwoSortedArrays.Merge(arr1, arr2, size1, size2);

	}

}
