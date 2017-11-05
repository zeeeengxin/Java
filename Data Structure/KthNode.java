package datastructure;

public class KthNode {
	public int kthNode(TreeNode root, int k) {
		int num = count(root.left);
		if (num == k - 1) {
			return root.key;
		}
		if (num > k - 1) {
			return kthNode(root.left, k);
		}
		else {
			return kthNode(root.right, k - num - 1);// subtract left sub-tree
		}
	}
	private int count(TreeNode root) {
		if (root == null)
			return 0;
		return 1 + count(root.left) + count(root.right);
	}
	// best On, worst On^2
	// average Ologn, worst n
	
	class TreeNodeAdvance {
		int value;
		TreeNodeAdvance left;
		TreeNodeAdvance right;
		int size;
	}
	
	public int kthNode2(TreeNodeAdvance root, int k) {
		int leftSize = root.left.size;
		if (k - 1 < leftSize) {
			return kthNode2(root.left, k);
		}
		else if (k - 1 == leftSize) {
			return root.value;
		}
		else {
			return kthNode2(root.right, k - leftSize - 1);
		}
	}
	private int countSize(TreeNodeAdvance root) {
		if (root == null)
			return 0;
		root.size = 1 + countSize(root.left) + countSize(root.right);
		return root.size;
	}
}


