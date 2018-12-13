/**
 * when looking at ListNode, look at the cases where the argument ==null!!
 * @author Atsushi
 *
 */


class Solution {
    public ListNode reverseList(ListNode head) {
        if(head ==null) return null;
    	ListNode last = new ListNode(head.val);
    	ListNode move = head.next;
    	ListNode first = last;
    	while(move!=null) {
    		ListNode att = new ListNode(move.val);
    		att.next = first;
    		first = att;
    		move = move.next;
    	}
        return move;
    }
}