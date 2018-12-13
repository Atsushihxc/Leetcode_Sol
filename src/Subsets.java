import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    	List<List<Integer>> list = new ArrayList<>();
    	backtrack(list, new ArrayList<>(), nums, 0);
    	return list;
        
    }
    private void backtrack(List<List<Integer>> list, ArrayList<Integer> temp, 
    		int[] nums, int start) {
    	list.add(new ArrayList<>(temp));
    	for(int i =start; i<nums.length; i++) {
    		temp.add(nums[i]);
    		//if(i == nums.length-1) break;
    		backtrack(list,temp,nums, i+1);
    		temp.remove(temp.size()-1);
    		
    	}
    	
    	
    }
}