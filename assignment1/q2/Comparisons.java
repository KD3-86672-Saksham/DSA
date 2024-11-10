package assignment1.q2;

import java.util.Scanner;

public class Comparisons {
	
	public static void linearSearch(int arr[]) {
		Scanner sc = new Scanner(System.in);
		int key;
		int comp = 0;
		System.out.println("enter the number to find: ");
		key = sc.nextInt();
		int index = 0;
		for(int i = 0; i<arr.length;i++) {
			comp++;
			if(arr[i] == key) {
				 index = i;
			}
		}
		System.out.println("index of last occurance of " + key + " is : " + index); 
		System.out.println("total number of comparisons are: " + comp); 
	}
	
	public static int binarySearch(int arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter key: ");
		int key;
		key = sc.nextInt();
		int left = 0;
		int right = arr.length-1;
		int mid;
				
		while(left<=right) {
			mid = (left+right)/2;
			if(arr[mid] ==  key) {
				return mid;
			}
			else if(arr[mid]>key) {
				right = mid -1;
			}
			else {
				left = mid +1;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		
//		int arr[] = {1,2,4,9,6,33,45,290,90,87,111};
//		linearSearch(arr);
		
		int arr1[] = {11,22,33,44,55,66,77,88,99};
		int index = binarySearch(arr1);
		
		if(index == -1) {
			System.out.println("key not found");
		}
		else {
			System.out.println("key found at index: " + index);
		}
	}

}
