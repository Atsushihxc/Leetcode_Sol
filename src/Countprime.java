/**
 * what is a proper way of matching the number with array index?
 * create an array of n+1 length, starting from index ==1
 * @author Atsushi
 *
 */

	class Solution {
	    public int countPrimes(int n) {
	    	if(n==1) return 1;
	    	boolean[] isProduct = new boolean[n+1];
	    	int count = 1;
	    	int i = 2;
	    	while(i<=n) {
	    		if(isProduct[i]== false) {
	    			count++;
	    			for(int j =i; i*j<n; j++) {
	    				isProduct[i*j] = true;
	    			}
	    		}
	    		
	    	}
	    	return count;
	        
	    }
	}

