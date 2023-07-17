package Exercise_107;

public class Solution {
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(0, null);
		ListNode head = dummy;
		while (list1 != null && list2 != null) {
			
			if (list1.val < list2.val) {
				
				head.next = list1;
				list1 = list1.next;
				
			} else {
				
				head.next = list2;
				list2 = list2.next;
				
			}
			head = head.next;
			
		}
		
		if (list1 != null) {
	        head.next = list1;
	    } else {
	        head.next = list2;
	    }
		
		return dummy.next;
	}
	
	public static void main(String[] args) {
		ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
	    ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));

	    ListNode mergedList = mergeTwoLists(list1, list2);

	    while (mergedList != null) {
	        System.out.print(mergedList.val + " ");
	        mergedList = mergedList.next;
	    }
	}
}
