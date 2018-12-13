import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    	Set<Integer> copy1 = new HashSet<Integer>();
    	for(int i = 0; i<nums1.length; i++) {
    		copy1.add(nums1[i]);
    	}
    	Set<Integer> copy2 = new HashSet<Integer>();
    	for(int i = 0; i<nums2.length; i++) {
    		copy2.add(nums1[i]);
    	}
    	copy1.retainAll(copy2);
    	int[] results = new int[copy1.size()];
    	int j =0;
    	for(int num : copy1) {
    		results[j] = num;
    		j++;
    		
    	}
        return results;
    }
}