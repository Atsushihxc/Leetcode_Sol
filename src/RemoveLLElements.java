/**
 * It is important to deal with the first item since it is possible that it
 * should be removed;
 * 
 * search only moves to the next one if the val of search.next != val;or the val equivalent 
 * to val has been removed;
 * @author Atsushi
 *
 */


class Solution {
	
    public ListNode removeElements(ListNode head, int val) {

    	while(head != null) {
    		if (head.val == val) head = head.next;
    		else break;
    	}
    	ListNode search = head;
    	while(search!=null) {
    		if(search.next == null) {
    			break;
    		}
    		if(search.next != null) {
    			search = search.next;
    		}
    		else {
    			search.next = search.next.next;
    			search = search.next;
    		}

    	}
    	
        return head;
    }
}
