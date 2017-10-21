package datastructure;

public class CheckBalance {
	public boolean isBalanced(TreeNode root) {
		/*int result = HeightB(root);
		if (result == -1) {
			return false;
		}
		return true;*/
		return HeightB(root) >= 0;
	}
	
	private int HeightB(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = HeightB(root.left);
		int rightHeight = HeightB(root.right);
		if (Math.abs(leftHeight - rightHeight) > 1 || leftHeight < 0 || rightHeight < 0) {
			return -1; // remember to add "leftHeight < 0 || rightHeight < 0"!!!
		}
		return 1 + Math.max(leftHeight, rightHeight);				
	}
}
