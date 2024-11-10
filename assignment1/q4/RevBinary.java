package assignment1.q4;

import java.util.Scanner;

public class RevBinary {
	
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
				left = mid +1;
			}
			else {
				right = mid -1;
			}
		}
		return -1;
	}


	public static void main(String[] args) {
		int arr[] = {99,88,77,66,55,44,33,22,11};
		int index = binarySearch(arr);
		
		if(index == -1) {
			System.out.println("key not found");
		}
		else {
			System.out.println("key found at index: " + index);
		}
	}

}
