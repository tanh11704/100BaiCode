package Exercise_29;

public class Solution {
	public static ListNode middleNode(ListNode head) {
		
		ListNode fastP = head, slowP = head;
		
		while (fastP != null && fastP.next != null) {
			slowP = slowP.next;
			fastP = fastP.next.next;
		}
		
		return slowP;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, null))))));
		ListNode p = middleNode(head);
		while (p != null) {
			System.out.println(p.val);
			p = p.next;
		}
	}
}
