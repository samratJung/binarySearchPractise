package binarySearch;

import java.util.Arrays;

/*
 *Given a list of integers nums, return whether the largest number is bigger than the second-largest number by more than two times. 
 */

public class LargestNumberByTwoTime {

	public boolean solve(int[] nums) {
        
			Arrays.sort(nums);
            
            if(nums[nums.length-1]>nums[nums.length-2]*2)
                return true;
            else
                return false;
			}
}
