package datastructure;

public class TreeNode {
	public int key;
	public TreeNode left;
	public TreeNode right;
	public TreeNode (int key) {
		this.key = key;
	}
}
	
class Test {
	int getHeight(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return (Math.max(getHeight(root.left), getHeight(root.right)) + 1);
	}
	
	/* TC: O(n), n is the number of nodes.
	 * SC: O(height)
	 * - worst: O(n)
	 * - average: O(logn)
	 */
	
	int countNodes(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + countNodes(root.left) + countNodes(root.right);
	}
	
}
