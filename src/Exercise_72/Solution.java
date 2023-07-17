package Exercise_72;

public class Solution {
	public static ListNode reverseList(ListNode head) {
		
		ListNode pre = null;
		ListNode curr = head;
		
		while (curr != null) {
			ListNode nextTemp = curr.next;
	        curr.next = pre;
	        pre = curr;
	        curr = nextTemp;
		}
		
		return pre;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(5, null)))))); 
		ListNode temp = reverseList(head);
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
}
