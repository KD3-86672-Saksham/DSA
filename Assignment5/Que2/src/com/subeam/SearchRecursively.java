//Write recursive function to perfrom search operation in bst.

package com.subeam;

import java.util.Scanner;

class BinarySearchTreeClass{
	
	static class Node{
		
		Node left, right;
		private int data;
		
		public Node(int val)
		{
			data = val;
			right = left = null;
		}
	}
	
	private Node root;
	
	public BinarySearchTreeClass()
	{
		root = null;
	}
	
	public void addNode(int val)
	{
		Node nd = new Node(val);
		
		if(root == null)
		{
			root = nd;
		}
		else 
		{
			Node iterator = root;
			
			boolean isIterating = true;
			
			while(isIterating)
			{
				if(val < iterator.data)
				{
					if(iterator.left==null)
					{
						iterator.left = nd;
						isIterating = false;
						break;
					}
					else
					{
						iterator = iterator.left;
					}
				}
				else
				{
					if(iterator.right == null)
					{
						iterator.right = nd;
						isIterating = false;
						break;
					}
					else
					{
						iterator = iterator.right;
					}
				}
			}
			
		}
	}
	
	public Node searchElement(int val)
	{
		return searchElement(root, val);
	}
	
	public Node searchElement(Node root, int val)
	{
		if (root == null || root.data == val) {
	        return root;
	    }
		
		if(val < root.data)
		{
			return searchElement(root.left, val);
		}
		else
		{	
			return searchElement(root.right, val);
		}
	}
	
}


public class SearchRecursively {

	public static void main(String[] args) {
			

			Scanner sc = new Scanner(System.in);
			BinarySearchTreeClass bst = new BinarySearchTreeClass();
			
			bst.addNode(8);
			bst.addNode(7);
			bst.addNode(4);
			bst.addNode(26);
			bst.addNode(1);
			bst.addNode(49);
			
			BinarySearchTreeClass.Node nd =  bst.searchElement(49);
			
			if(nd == null)
			{
				System.out.println("Element Not Found");
			}
			else
			{
				System.out.println("Element Found");
			}

	}

}
