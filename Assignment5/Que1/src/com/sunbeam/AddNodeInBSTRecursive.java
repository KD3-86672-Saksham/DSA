//1. Write recursive function to add node into bst

package com.sunbeam;

import java.util.Scanner;

class BinarySearchTree{
	
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
	
	public BinarySearchTree()
	{
		root = null;
	}
	
	public void addNode(int val) {
	    root = addRecursive(root, val);
	}
	
	private Node addRecursive(Node root, int val) {
	    
		if (root == null) {
	        return new Node(val);
	    }
	    
	    if (val < root.data) {
	    	root.left = addRecursive(root.left, val);
	    } else {
	    	root.right = addRecursive(root.right, val);
	    }
	    return root;
	}
	
}

public class AddNodeInBSTRecursive {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			BinarySearchTree bst = new BinarySearchTree();
			
			bst.addNode(8);
			bst.addNode(7);
			bst.addNode(4);
			bst.addNode(26);
			bst.addNode(1);
			bst.addNode(49);
			
	}
}


