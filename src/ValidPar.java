import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
    	boolean valid = true;
    	Map<Character, Character> par = new HashMap <Character, Character>();
    	par.put(')', '(');
    	par.put('}', '{');
    	par.put(']', '[');
    	Stack<Character> st = new Stack<Character>();
    	for (int  i=0; i<s.length(); i++) {
    		if(st.isEmpty()){
    			st.push(s.charAt(i));
    		}
    		else {
    			if(par.containsKey(s.charAt(i))) {
    				if(par.get(s.charAt(i)) == st.peek()) {
    					st.pop();
    				}
    				else{
    					st.push(s.charAt(i));
    				}
    			}
    			else {
    				st.push(s.charAt(i));
    			}
    		}
    	}
        if (!par.isEmpty()) valid = false;
        
        return valid;
    }
}