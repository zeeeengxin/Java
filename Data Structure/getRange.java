package datastructure;

import java.util.*;

// need more practice
public class getRange {
	public List<Integer> getRangeTree(TreeNode root, int min, int max) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		helper(root, min, max, arr);
		return arr;
	}
	private void helper(TreeNode root, int min, int max, List<Integer> arr) {
		if (root == null) {
			return;
		}
		if (root.key >= min) {
			helper(root.left, min, max, arr);
		}
		if (root.key >= min && root.key <= max) {	
			arr.add(root.key);// don't forget to check the range
		}
		if (root.key < max) {
			helper(root.right, min, max, arr);
		}
	}
}
