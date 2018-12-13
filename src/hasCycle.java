import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

/**
 * Set!!! 
 * Use set/hash table to check if something is seen before;
 * @author Atsushi
 *
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        boolean cycle = false;
        Set<ListNode> all = new HashSet<ListNode>();
        while(head != null){
            if(! all.contains(head)){
                all.add(head);
            }
            else {
                cycle = true;
                break;
            }
        }
        return cycle;
    }
}