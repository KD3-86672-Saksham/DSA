package assignment1.q3;

import java.util.Scanner;

public class Search {
	
	public static void searchByEmpId(Employess[] arr, int id) {
		for(int i = 0; i<arr.length;i++) {
			if(arr[i].getEmpid() == id) {
				new Employess(arr[i].getEmpid(),arr[i].getName());
				System.out.println(arr[i].toString());
			}
		
		}
		
	}
	
	
	public static int searchByName(Employess[] arr, String name) {
		for(int i = 0; i<arr.length;i++) {
			if(name.equals(arr[i].getName())) {
				return i;
				
			}
		
		}
		return -1;
		
	}
	
	

	public static void main(String[] args) {
		Employess[] arr = new Employess[5];
		arr[0] = new Employess(1,"rishabh");
		arr[1] = new Employess(2,"omkar");
		arr[2] = new Employess(3,"mayur");
		arr[3] = new Employess(4,"saksham");
		arr[4] = new Employess(5,"vivek");
		
		//int id;
		String name;
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter id to search");
		//id = sc.nextInt();
		System.out.println("enter name to search");
		name = sc.next();
		int c=searchByName(arr, name);
		//searchByEmpId(arr, id);
		System.out.println(arr[c].toString());
		

	}

}
















//
//
//package com.sunbeam.dsa;
//
//import java.util.Scanner;
//
//class Employee{
//	
//	int id;
//	String name;
//	public int length;
//	public Employee() {
//	}
//	public Employee(int id, String name) {
//		this.id = id;
//		this.name = name;	
//	}
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + "]";
//	}
//	
//	
//}
//
//public class Question_03_A {
//	
//	public static void linearSearchByid(Employee[] arr, int key) {
//		
//		int index = 0;
//		for(int i=0;i<arr.length-1;i++)
//		{
//			if(arr[i].id == key) {
//				System.out.println("Employee is found :- "+arr[i]);
//				index++;
//			}
//		}
//		if(index ==0)
//		System.out.println("Employee is not found .............");
//	}
//
//	public static void main(String[] args) {
//		
//		Employee[] arr = new Employee[5];
//		
//		arr[0] = new Employee(1,"Aditya");
//		arr[1] = new Employee(2,"Ankush");
//		arr[2] = new Employee(3,"Nishad");
//		arr[3] = new Employee(4,"Mayur");
//		arr[4] = new Employee(5,"Omkar");
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter id :- ");
//		int key = sc.nextInt();
//		
//		System.out.print("Enter name of the Employee :- ");
//		String name =  sc.next();
//		linearSearchByid(arr,key);
//	}
//	
//	
//
//}