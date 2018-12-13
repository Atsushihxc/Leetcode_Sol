import java.util.Stack;

/**
 * analyze the space and runtime complexity!!
 * @author Atsushi
 *
 */
class Solution {
	   public boolean backspaceCompare(String S, String T) {
	        int i = S.length() - 1, j = T.length() - 1;
	        int skipS = 0, skipT = 0;

	        while (i >= 0 || j >= 0) { // While there may be chars in build(S) or build (T)
	            while (i >= 0) { // Find position of next possible char in build(S)
	                if (S.charAt(i) == '#') {skipS++; i--;}
	                else if (skipS > 0) {skipS--; i--;}
	                else break;
	            }
	            while (j >= 0) { // Find position of next possible char in build(T)
	                if (T.charAt(j) == '#') {skipT++; j--;}
	                else if (skipT > 0) {skipT--; j--;}
	                else break;
	            }
	            // If two actual characters are different
	            if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j))
	                return false;
	            // If expecting to compare char vs nothing
	            if ((i >= 0) != (j >= 0))
	                return false;
	            i--; j--;
	        }
	        return true;
	   }

/*    public boolean backspaceCompare(String S, String T) {
    	return (convert(S).equals(convert(T)));
        
    }
    
    public String convert(String s) {
    	Stack<Character> st = new Stack<>();
    	for(int i = 0; i<s.length();i++) {
    		if(s.charAt(i) != '#') {
    			st.push(s.charAt(i));
    		}
    		else {
    			if(! st.isEmpty()) {
    				st.pop();
    			}
    		}
    	}
    	return st.toString();
    }*/
    
}