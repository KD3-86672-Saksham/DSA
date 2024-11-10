package assignment1.q7;

import java.util.Scanner;

public class Rank {
	
	public static void rank(int arr[], int key) {
		int count = 0;
		for(int i = 0;i < arr.length;i++) {
			if(key >= arr[i]) {
				count++;
			}
			
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element: ");
		int key;
		key = sc.nextInt();
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };
		rank(arr,key);
	}

}
