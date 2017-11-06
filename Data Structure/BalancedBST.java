package datastructure;

public class BalancedBST {
	public boolean bBST(TreeNode root) {
		if (root == null) {
			return true;
		}
		if (helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE) == -1)
			return false;
		return true;
	}
	private int helper(TreeNode root, int min, int max) {
		if (root == null)
			return 0;
		if (root.key <= min || root.key >= max)
			return -1;
		int left = helper(root.left, min, root.key);
		int right = helper(root.right, root.key, max);
		if (left == -1 || right == -1)
			return -1;
		if (Math.abs(left - right) > 1)
			return -1;
		else
			return Math.max(left, right); //not left + right + 1, return the height!
	}
}
