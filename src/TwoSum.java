/**
 * this qn may have many diff approach such as brute force
 * This approach is using a HashMap to search for the numbers
 * time complexity: O(n) since we are traversing the list of length n and each look up has time complexity 
 * O(1)
 * Space complexity: O(n)
 * while we are traversing the list, we uses O(1) to store a new number 
 */


import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diff= new HashMap<Integer, Integer>();
		int[] ans = new int[2];
        for (int i = 0; i<nums.length;i++) {
        	if(!diff.containsKey(nums[i])) {
        		diff.put(target-nums[i], i);
        		
        	}
        	else {
        		ans[0] = diff.get(nums[i]);
        		ans[1] = i;
        		break;

        	}
        }
		return ans;
    }
}