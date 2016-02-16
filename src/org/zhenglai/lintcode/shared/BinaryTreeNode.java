package org.zhenglai.lintcode.shared;

public class BinaryTreeNode {
	
	/**
	 * Abstraction of the value contained in the node
	 * (Generally it's not a good idea to provide raw public field value)
	 */
	public int val;
	
	public BinaryTreeNode left;
	
	public BinaryTreeNode right;
	
	public BinaryTreeNode(int val) {
		this(val, null, null);
	}

	public BinaryTreeNode(int val, BinaryTreeNode left, BinaryTreeNode right) {
		super();
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
