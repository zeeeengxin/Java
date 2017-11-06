package datastructure;

/* Find the node with the max difference in the total number of descendants in
 * its left subtree and right subtree
 */
public class MaxDiff {
	public int maxDiff(TreeNode root) {
		if (root == null)
			return 0;
		int[] maxD = new int[1];
		helper(root, maxD);
		return maxD[0];
	}
	private int helper(TreeNode root, int[] maxD) {
		if (root == null)
			return 0;
		int left = helper(root.left, maxD);
		int right = helper(root.right, maxD);
		if (Math.abs(left - right) > maxD[0]) {
			maxD[0] = Math.abs(left - right);
		}
		return left + right + 1;
	}
}
