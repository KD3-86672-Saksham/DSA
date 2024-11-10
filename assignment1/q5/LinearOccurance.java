package assignment1.q5;

import java.util.Scanner;

public class LinearOccurance {

		public static int linearOccurance(int arr[], int key, int b) {
			int index = 0;
			int count = 0;
			for(int i =0; i<arr.length;i++) {
				if(arr[i] == key) {
					 index = i;
					count++;
					if(count == b) {
						return i;
					}
					//return i;
				}
			}
		return -1;
		}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int key;
		System.out.println("enter the number to be found: ");
		key = sc.nextInt();
		int b;
		System.out.println("enter the occurance: ");
		b = sc.nextInt();
		
		int arr[] = {1,1,1,2,2,4,4,3,3,3,3,9,8,9,8,7,8};
		int a = linearOccurance(arr, key,b);
		System.out.println(a);
	}

}
