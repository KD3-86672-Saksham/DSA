package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

// Write a function to sort employees by their salary.
public class Employee {
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void sortBySalary(Employee employee[], int N)
	{
		for(int i = 0; i < N; i++ )
		{
			for(int j = 0; j < N-1; j++)
			{
				if(employee[j+1].getSalary() < employee[j].getSalary())
				{
					Employee temp = employee[j];
					employee[j] = employee[j+1];
					employee[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee [] employee = {
			new Employee(1, "Makarand", 1000),
			new Employee(2, "Shreyaa",2000),
			new Employee(3, "Pascal",500)
		};
		
		System.out.println("Before sort : " + Arrays.toString(employee));
		sortBySalary(employee, employee.length);
		System.out.println("After sort : " + Arrays.toString(employee));
		

	
	}
}
