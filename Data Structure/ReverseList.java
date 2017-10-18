package datastructure;

/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */

public class ReverseList {
	public ListNode reverse(ListNode head) {
		ListNode pre = null;
		ListNode cur = head;
		ListNode next = head;
		// just create a reference, not a new ListNode
		// don't need to "new ListNode"

		while (cur != null) {
			next = cur.next;
			// next = next.next is the same, but this is better
			// because we already checked that cur != null
			// explicitly avoid nullpointerexception
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		return pre;
	}
	
	public ListNode reverse_recursion(ListNode head) {
		if (head == null || head.next == null) {
			return head;
			// corner case: head == null
			// can't write head.next == null first! if head is null, check
			// head.next first will cause null pointer error
		}
		ListNode newHead = reverse_recursion(head.next);
		// must do recursion first!
		head.next.next = head;
		head.next = null;
		return newHead;
	}
}
