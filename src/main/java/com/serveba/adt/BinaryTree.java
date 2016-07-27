package com.serveba.adt;

public class BinaryTree {

	private BinaryTreeNode root;

	private int counter;

	public BinaryTree() {
		root = null;
		counter = 0;
	}
	
	public BinaryTree(Object data) {
		root = new BinaryTreeNode(data);
		counter++;
	}

	public int size() {
		return counter;
	}

	public BinaryTreeNode getRoot() {
		return root;
	}

	public boolean isEmpty() {
		return root == null;
	}

	/**
	 * Is End-of-branch
	 */
	public boolean isEob(BinaryTreeNode node) {
		return node.getData() == null;
	}

	public boolean isLeaf(BinaryTreeNode node) {
		return node.getLeft() == null && node.getRight() == null;
	}
	
	public BinaryTreeNode insertLeft(BinaryTreeNode node, Object data) {
		if(node == null) {
			return null;
		}
		node.setLeft(new BinaryTreeNode(data));
		counter++;
		return node.getLeft();
	}
	
	public BinaryTreeNode insertRight(BinaryTreeNode node, Object data) {
		if(node == null) {
			return null;
		}
		node.setRight(new BinaryTreeNode(data));
		counter++;
		return node.getRight();
	}
	
	public String preorder() {
		StringBuilder s = new StringBuilder("");
		preorder(root, s);
		return s.toString();
	}
	
	private void preorder(BinaryTreeNode node, StringBuilder info) {
		if(node != null) {
			info.append(node.getData());
			preorder(node.getLeft(), info);
			preorder(node.getRight(), info); 
		}
		
	}
	
	public String inorder() {
		StringBuilder s = new StringBuilder("");
		inorder(root, s);
		return s.toString();
	}
	
	private void inorder(BinaryTreeNode node, StringBuilder info) {
		if(node != null) {
			inorder(node.getLeft(), info);
			info.append(node.getData());
			inorder(node.getRight(), info); 
		}
	}

	public String postorder() {
		StringBuilder s = new StringBuilder("");
		postorder(root, s);
		return s.toString();
	}
	
	private void postorder(BinaryTreeNode node, StringBuilder info) {
		if(node != null) {
			postorder(node.getLeft(), info);
			postorder(node.getRight(), info); 
			info.append(node.getData());
		}
	}
	
	public String levelorder() {
		if(root == null) {
			return "";
		}
		
		Queue queue = new Queue();
		queue.enqueue(root);
		StringBuilder info = new StringBuilder("");
		
		while(!queue.isEmpty()) {
			
			BinaryTreeNode node= (BinaryTreeNode)queue.peek();
			info.append(node.getData());
			queue.dequeue();
			if(node.getLeft() != null) {
				queue.enqueue(node.getLeft());
			}
			if(node.getRight() != null){
				queue.enqueue(node.getRight());
			}
		}
		
		return info.toString();
	}
	
}
