package datastructure;

public class InsertList {
	public ListNode insert(ListNode head, int value) {
		ListNode newNode = new ListNode(value);
		if (head == null || head.value >= value) {// >= is correct!
			newNode.next = head;
			return newNode;
		}
		ListNode oldHead = head;
		while (head != null && head.value < value) {
			if (head.next == null || head.next.value >= value) {
				newNode.next = head.next;
				head.next = newNode;
			}
			head = head.next;
		}
		return oldHead;
	}
}
/*	ListNode cur = head;
	ListNode prev = null;
	while (cur != null && cur.value < value) {
	prev = cur;
	cur = cur.next;
	}
	prev.next = new ListNode(value);
	prev.next.next = cur;
	return head;

	method2: use prev pointer to store prev position */