package datastructure;

/*
 * find the max possible sum from any node to any node (can be one node itself. can only
 * be on the path from an ancestor to one of the descendant nodes)
 */
public class MaxPathSum3 {
	public int MaxPathSum(TreeNode root) {
		if (root == null)
			return 0;
		//int[] maxSum = new int[1];
		//maxSum[0] = Integer.MIN_VALUE;
		int[] maxSum = new int[] {Integer.MIN_VALUE}; // declare and initialize
		helper(root, 0, maxSum);
		return maxSum[0];
	}
	private void helper(TreeNode root, int preSum, int[] maxSum) {
		if (root == null)
			return;
		int curSum = root.key;
		if (preSum > 0)
			curSum = curSum + preSum;
		//if (curSum > maxSum[0])
		//	maxSum[0] = curSum;
		maxSum[0] = Math.max(curSum, maxSum[0]);//use Math.max
		helper(root.left, curSum, maxSum);
		helper(root.right, curSum, maxSum);
	}
}
