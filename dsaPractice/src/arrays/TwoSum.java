package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {

		// optimized solution and it will take o(n) time and space o(n)
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	        	return new int[]{map.get(complement), i}; 
	        }
	        	map.put(nums[i], i);
	    }

	    return new int[]{-1, -1};
	    }
	
	    /*
	     // brute force approach o(n^2)
	        int []ans = new int[2];
	        for(int i = 0; i < nums.length - 1; i++){
	            for(int j = i + 1; j < nums.length; j++){
	                if(nums[i] + nums[j] == target){
	                    ans[0] = i;
	                    ans[1] = j;
	                }
	            }
	        }
	        return ans;
	    */

	/*
	 * 
	//if array will sorted then 2-pointer approach will work
	        int left = 0, right = nums.length - 1;
	        while(left < right){
	            int sum = nums[left] + nums[right] ;
	            if(sum == target){
	                return new int[]{left,right};
	            }

	            if(sum < target){
	                left++;
	            }else if(sum > target){
	                right--;
	            }
	        }

	        return new int[]{0,0};
	    }
	    */

	public static void main(String[] args) {
		//test case
		int arr1[] = {2,7,11,15};
		int target = 9;
		
		
		int arr2[] = {3,2,4};
		int target2 = 6;
		System.out.println(Arrays.toString(TwoSum.twoSum(arr2, target2)));
	}
}
