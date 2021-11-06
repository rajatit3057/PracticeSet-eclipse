package com.Practice;

public class TreeNode {
	String value;
	TreeNode leftChild;
	TreeNode rightChild;
	
	TreeNode(String val){
		this.value=val;
		this.leftChild=null;
		this.rightChild=null;
	}
	
	TreeNode(String val, TreeNode left, TreeNode right){
		this.value=val;
		this.leftChild=left;
		this.rightChild=right;
	}
}
