package datastructure;

public class MergeList {
	public ListNode merge2(ListNode head1, ListNode head2) {
		if (head1 == null) {
			return head2;
		}
		if (head2 == null) {
			return head1;
		}
		if (head1.value < head2.value) {
			head1.next = merge2(head1.next, head2);
			return head1;
		}
		else {
			head2.next = merge2(head1, head2.next);
			return head2;
		}
	}
	
	public ListNode merge(ListNode head1, ListNode head2) {
		ListNode dummy = new ListNode(0);
		/*if (head1 == null && head2 == null)
			return null; not necessary; dummy.next is null by default */
		ListNode tail = dummy; //use to move to next
		// dummy only use to return the new head
		ListNode one = head1;
		ListNode two = head2;// usually we don't change params
		while (one != null && two != null) {// neither is null
			if (one.value < two.value) {
				tail.next = one;
				one = one.next;
			} else {
				tail.next = two;
				two = two.next;
			}
			tail = tail.next;
		}
		if (one != null) {// use "!= null"
			tail.next = one;
		}
		if (two != null) {
			tail.next = two;
		}
		return dummy.next;
	}
}
