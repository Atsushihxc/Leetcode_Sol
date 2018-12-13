/**
 * create a private class Node that constructs the stack structure
 * The structure is similar to LinkNode 
 * Except that there is an additional variable min, that stores the global min
 * @author Atsushi
 *
 */


class MinStack {
	private Node head;
	private class Node{
		int val;
		int min;
		Node next;
		private Node (int val, int min) {
			this(val, min,null);
		}
		private Node (int val, int min,Node next) {
			this.val = val;
			this.min = min;
			this.next = next;
		}
	}

    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
    	if (head ==null)
    		head = new Node(x,x);
    	else
    		head = new Node(x, Math.min(x, head.min),head);
    }
    
    public void pop() {
    	head = head.next;
        
    }
    
    public int top() {
    	return head.val;
        
    }
    
    public int getMin() {
    	return head.min;
        
    }
}
