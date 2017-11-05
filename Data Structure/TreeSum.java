package datastructure;

public class TreeSum {
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) 
			return false;
		if (root.key == sum && root.left == null && root.right == null)
			return true;
		else
			return hasPathSum(root.left, sum - root.key) || 
					hasPathSum(root.right, sum - root.key);
	}
	// "if (root == null && sum == 0) return true" is wrong!
	// it might not be a leaf..
}
