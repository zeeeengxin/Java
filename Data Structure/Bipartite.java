package datastructure;

import java.util.*;

public class Bipartite {
	public boolean isBipartite(List<GraphNode> graph) {
		if (graph == null) {
			return true;
		}
		for (GraphNode node : graph) {
			Queue<GraphNode> q = new LinkedList<GraphNode>();
			if (node == null) {
				continue;
			}
			if (node.color == 0) {// check this part only not when checked before
				node.color = 1;
				q.offer(node);
				while (!q.isEmpty()) {
					GraphNode cur = q.poll();
					for (GraphNode nei : cur.neighbors) {
						if (nei.color == 0) {
							nei.color = (byte) (3 - cur.color);
							q.offer(nei);
						}
						else if (nei.color == cur.color) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}
}
