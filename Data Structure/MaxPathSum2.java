package datastructure;

public class MaxPathSum2 {
	public int maxPathSum(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int[] maxSum = new int[]{Integer.MIN_VALUE};
		helper(root, maxSum);
		return maxSum[0];
	}
	private int helper(TreeNode root, int[] maxSum) {
		if (root == null) {
			return 0;
		}
		int left = helper(root.left, maxSum);
		int right = helper(root.right, maxSum);
		int cur = root.key;
		if (left > 0) cur += left;
		if (right > 0) cur += right; // if "> 0" add to current node's value
		maxSum[0] = Math.max(cur, maxSum[0]);
		return Math.max(Math.max(left, right), 0) + root.key; // return the max of left and right
		// if both left and right are negative, return node's single value
	}
}
