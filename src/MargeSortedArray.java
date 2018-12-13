/**
 * Take care of how you create a copy of an array!!!
 * 
 * @author Atsushi
 *
 */


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	int[] copy = nums1.clone();
    	int count1 = 0;
    	int count2 = 0;
    	int k =0;
    	while (k<m+n) {
            if(count1 ==m || count2 ==n) break;
    		if(copy[count1]<nums2[count2]) {
    			nums1[k] = copy[count1];
    			count1++;
    		}
    		else {
    			nums1[k] = nums2[count2];
                count2++;
    		}
    		k++;
    	}
    	if(count2==n) {
    		while(count1<m) {
    			nums1[k] = copy[count1];
    			count1++;
                k++;
    		}
    	}
    	else if(count1==m) {
    		while(count2<n) {
    			nums1[k] = nums2[count2];
    			count2++;
                k++;
    		}
    	}

 
   
        
    }
}