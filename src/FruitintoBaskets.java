import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int totalFruit(int[] tree) {
    	Map<Integer, Integer> fruit = new HashMap<Integer, Integer>();
  
    	for(int i =0; i<tree.length; i++) {
    	  	Set<Integer> types = new HashSet<>();
    		types.add(tree[i]);
    		
    		for(int j = i;j<tree.length;j++) {
    			if(!types.contains(tree[j])) types.add(tree[j]);
    			if(types.size()==3) {
    				fruit.put(i, j-i);
    				break;
    			}

    		}
    	}
    	return Collections.max(fruit.values());
    	
    	
    	
    /*	int max =0;
    	for (int i =0; i<tree.length; i++) {
    		int end = i;
    		Set<Integer> basket = new HashSet<Integer>();
			int size =0;
    		while(end<tree.length) {
    			if(! basket.contains(tree[end])) basket.add(tree[end]);
    			if(basket.size() <=2) size = end-i+1;
    			else {
    				break;
    			}
    		}
    		if(size >max) max = size;
    				
    	}

        return max;*/
    }
}