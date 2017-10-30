package datastructure;

import java.util.*;

public class BfsTree {
	public void BFS(TreeNode root) {
		if (root == null)
			return;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		while(!q.isEmpty()) {
			int n = q.size();
			for (int i = 0; i < n; i++) {
				TreeNode cur = q.poll();
				if (cur.left != null) // don't forget to check null!
					q.offer(cur.left);
				if (cur.right != null)
					q.offer(cur.right);
				System.out.print(cur.key + " ");
			}
			System.out.println();
		}
		
	}
}
