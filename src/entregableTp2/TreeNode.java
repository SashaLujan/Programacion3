package entregableTp2;

public class TreeNode {

	private int value;
	private TreeNode left;
	private TreeNode right;

	public TreeNode(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public TreeNode() {
		this.value = 0;
		this.left = null;
		this.right = null;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public Integer getValue() {
		return value;
	}

	public void setValor(int value) {
		this.value = value;
	}

	public boolean isLeaf() {
		return (this.left == null && this.right == null);
	}
}
