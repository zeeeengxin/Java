package datastructure;

public class isBST {
	public boolean isBSTree(TreeNode root) {
		return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	private boolean helper(TreeNode root, int left, int right) {
		if (root == null) {
			return true; // should always check null before call root.xx
		}
		if (root.key <= left || root.key >= right) {
			return false;
		}
		return helper(root.left, left, root.key) && 
				helper(root.right, root.key, right);
	}
	
	private int tmp = Integer.MIN_VALUE;
	public boolean isBSTree2(TreeNode root) {
		if (root == null) {
			return true;
		}
		if (isBSTree2(root.left) == false)
			return false;
		if (root.key <= tmp)
			return false;
		tmp = root.key;
		if (isBSTree2(root.right) == false)
			return false;
		return true;
	}
}
