/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */ 

/**
 * what do we need to pay attention to?
 * 
 * @author Atsushi
 *
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode search = head;
        while(search.next !=null ){
            if(search.val == search.next.val){
                if(search.next.next != null){
                search.next = search.next.next;
                }
                else{
                    search.next = null;
                    return head;
                }
                
            }
            else{
                search = search.next;
            }
        }
        return head;
    }
}