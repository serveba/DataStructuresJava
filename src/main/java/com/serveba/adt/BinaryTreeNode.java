package com.serveba.adt;

public class BinaryTreeNode {

	BinaryTreeNode left;
	BinaryTreeNode right;
	Object data;

	public BinaryTreeNode(Object dataValue) {
    left = null;
    right = null;
    data = dataValue;
  }

	public Object getData() {
		return data;
	}

	public void setData(Object dataValue) {
		data = dataValue;
	}

	public BinaryTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode leftNode) {
		left = leftNode;
	}

	public BinaryTreeNode getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode rightNode) {
		right = rightNode;
	}

	public void destroy() {
		left = null;
		right = null;
		data = null;
	}
	
	@Override
	public String toString() {
		if(data == null) {
			return "";
		}
		
		return data.toString();
	}

}
