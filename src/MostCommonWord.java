import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * to split a string at any non-word character
 * use "\\W+"
 * @author Atsushi
 *
 */

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
    	String para = paragraph.toLowerCase();
    	String[] check = para.split("\\W+");
    	Set<String> ban = new HashSet<>();
    	for(int i =0; i<banned.length; i++) {
    		ban.add(banned[i].toLowerCase());
    	}
    	
    	Map<String, Integer> freq = new HashMap<>();
    	for(int j = 0; j<check.length; j++) {
    		if(! ban.contains(check[j])) {
    			if(! freq.containsKey(check[j])) {
    				freq.put(check[j], 1);
    			}
                else {
    			int time = freq.get(check[j]);
    			freq.put(check[j], time+1);
    		}
    		
    		}
    	}
    	
    	int max = 0;
    	String answer = "";
    	for(String s: freq.keySet()) {
    		if(freq.get(s)>=max) {
    			max = freq.get(s);
    			answer = s;
    		}
    		
    	}
    	return answer;
        
    }
}
