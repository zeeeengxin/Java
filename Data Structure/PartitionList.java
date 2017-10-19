package datastructure;

public class PartitionList {
	public ListNode partition(ListNode head, int target) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode smallDummy = new ListNode(0);
		ListNode largeDummy = new ListNode(0);
		ListNode smallTail = smallDummy;
		ListNode largeTail = largeDummy;
		ListNode origin = head; // don't forget what I did...
		while (origin != null) {
			if (origin.value < target) {
				smallTail.next = origin;
				smallTail = smallTail.next;
			}
			else {
				largeTail.next = origin;
				largeTail = largeTail.next;
			}
			origin = origin.next;
		}
		smallTail.next = largeDummy.next;
		largeTail.next = null;
		return smallDummy.next;// return dummy, not tail
	}
}
