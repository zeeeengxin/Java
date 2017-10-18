package datastructure;

public class CheckCycle {
	public boolean hasCycle(ListNode head) {
		/* if (head == null) {
			return false;
		} */
		// above code is unnecessary
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				return true;
			}
		}
		return false;
	}
}
