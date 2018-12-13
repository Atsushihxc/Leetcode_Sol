class Solution {
    /*public void moveZeroes(int[] nums) {
    	//int i = 0;
    	int j = 0;
    	for(int  i =0;i <nums.length; i++) {
    		if(j == nums.length) return;
    		if (nums[i]==0) {
    			if(nums[j]!=0) {
    				int temp = nums[j];
    				nums[i] = nums[j];
    				nums[j] = temp;
    			}
    			else {
    				i--;
    			}
    		}
    		j++;
    	}
        
    }*/
	
	//this is a much faster implementation
	public void moveZeroes(int[] nums) {

	    int j = 0;
	    for(int i = 0; i < nums.length; i++) {
	        if(nums[i] != 0) {
	            int temp = nums[j];
	            nums[j] = nums[i];
	            nums[i] = temp;
	            j++;
	        }
	    }
	}
}