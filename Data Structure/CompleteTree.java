package datastructure;

import java.util.*;

public class CompleteTree {
	public boolean isComplete(TreeNode root) {
		if (root == null) {
			return true;
		}
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		boolean flag = false;
		q.offer(root);
		while (!q.isEmpty()) {
			TreeNode cur = q.poll();
			if (cur.left == null && cur.right != null) {
				return false;
			}
			if (flag == true && (cur.left != null || cur.right != null)) {
				return false;
			}
			if (cur.left == null || cur.right == null) {
				flag = true;
			}
			// don't forget to offer children!!!
			if (cur.left != null) {
				q.offer(cur.left);
			}
			if (cur.right != null) {
				q.offer(cur.right);
			}
		}
		return true;
	}
}
