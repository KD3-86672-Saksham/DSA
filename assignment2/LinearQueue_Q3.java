package com.sunbeam;

import java.util.Scanner;

public class LinearQueue_Q3 
{
	int arr[];
	int front, rear;
	final int SIZE;
	
	
	public LinearQueue_Q3(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = 0;
	}
	
	public void push(int value)
	{
		if(rear == 0)
		{
			arr[rear] = value;
			rear++;
		}
		else
		{
			rear++;
			arr[rear] = value;
		}
	}
	public int pop()
	{
		if(front == 0)
		{
			int temp = arr[front];
			front++;
			return temp;
		}
		else
		{
			front++;
			int temp = arr[front];
			return temp;
		}
	}
	int peek()
	{
		return arr[front];
	}
	
	public boolean isFull() {
		return rear == SIZE-1;
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		LinearQueue_Q3 q = new LinearQueue_Q3(4);
		int choice;
		
		do {
			System.out.println("1. Push\n2. Pop\n3. Peek\n4. Exit");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();

			switch (choice) {
				case 1:
					if (q.isFull())
						System.out.println("Queue is full");
					else {
						System.out.print("Enter value : ");
						int value = sc.nextInt();
						q.push(value);
					}
					break;

				case 2:
					if (q.isEmpty())
						System.out.println("Queue is empty");
					else
						System.out.println("Poped data : " + q.pop());
					break;

				case 3:
					if (q.isEmpty())
						System.out.println("Queue is empty");
					else
						System.out.println("Peeked data : " + q.peek());
					break;
			}
		} while (choice != 4);
	}
}
