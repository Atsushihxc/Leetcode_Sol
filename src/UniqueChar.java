import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
    	Map<Character, Integer> uni = new HashMap<Character, Integer>();
    	for(int i =0; i<s.length();i++) {
    		if(! uni.containsKey(s.charAt(i)))
    			uni.put(s.charAt(i), 1);
    		else {
    			int freq = uni.get(s.charAt(i));
    			uni.put(s.charAt(i), freq+1);
    		}
    		

    	}
    	for (Character letter:uni.keySet()) {
    		if(uni.get(letter) ==1) return letter;
    	}
    	return -1;
        
    }
    //below is a faster implementation
    public int uniLetter (String s) {
    	for(int i = 0; i<s.length();i++) {
    		char here = s.charAt(i);
    		if(s.indexOf(here) == s.lastIndexOf(here)) return i;
    	}
    	return -1;
    }
}