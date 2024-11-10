package com.sunbeam;

import java.util.Arrays;

//	 Modify the insertion sort algorithm to sort the array in descending order
public class Q1 {
	public static void insertionSort(int arr[], int N)
	{
//		for (int i = 1; i < N; i++ )
//		{
//			int temp = arr[i];
//			int j;
//			for(j = i - 1; j >=0 && arr[j] < temp; j++)
//			{
//				arr[j] = arr[j + 1];
//			}
//			arr[j + 1] = temp;
//		}
		
		for(int i = 1 ; i < N ; i++) {
			int temp = arr[i];
			int j;
			for(j = i - 1 ; j >= 0 && arr[j] < temp ; j--) {
				//		 Only change is here ^ 
				arr[j+1] = arr[j];
			}
			arr[j + 1] = temp;
		}
	}
	
	
	
		public static void main(String[] args) {
		int arr[] = {44, 55, 22, 66, 11, 33};
		System.out.println("Array before insertion sort : " + Arrays.toString(arr));

		insertionSort(arr, arr.length);
		
		System.out.println("Array after insertion sort : " + Arrays.toString(arr));
	}
}
