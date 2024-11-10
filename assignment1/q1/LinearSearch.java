package assignment1.q1;

import java.util.Scanner;

public class LinearSearch {
	
	public static void linearSearch(int arr[]) {
		Scanner sc = new Scanner(System.in);
		int key;
		System.out.println("enter the number to find: ");
		key = sc.nextInt();
		int index = 0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] == key) {
				 index = i;
			}
		}
		System.out.println("index of last occurance of " + key + " is : " + index); 
	}
	
	public static void anotherLinearSearch(int arr[]) {
		Scanner sc = new Scanner(System.in);
		int key;
		key = sc.nextInt();
		for(int i = arr.length - 1; i>0;i--) {
			if(arr[i] == key) {
				
				 System.out.println("index of last occurance of " + key + " is : " + i);
				 break;
			}
		}
	}
	

	public static void main(String[] args) {
		
		int arr[] = {1,2,4,9,6,33,45,2,90,87,1};
		anotherLinearSearch(arr);
		

	}

}
