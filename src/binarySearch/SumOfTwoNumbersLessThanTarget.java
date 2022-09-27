package binarySearch;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*
 *Keep moving both the cursor while comparing with the sum of the previous two cursor,
 *the first is compared with the minimum integer value. 
 */

public class SumOfTwoNumbersLessThanTarget {

	public static int solve(int[] nums, int target)
	{
		Arrays.sort(nums);
		int front_cursor=0, last_cursor=nums.length-1, max_sum=Integer.MIN_VALUE;
		
		while(front_cursor<last_cursor)
		{
			if(nums[front_cursor]+nums[last_cursor]<target)
			{
				max_sum=Math.max(max_sum, nums[front_cursor]+nums[last_cursor]);
				front_cursor++;
			}
			else
				last_cursor--;
			
		}
		return max_sum;
	}
	
	/**
	 * This takes n**2 time and is not viable for bigger length nums as it exceeds the time limit in competitive programming 
	 * website.
	 * 
	 * Make two cursor and run them comparing the values while adding them.
	 * front_cursor<moving_cursor
	 * 
	 */
	public static int solve2(int[] nums, int target)
	{
        Arrays.sort(nums);
        int max_sum=0;

        if(target>0)
        {   for(int front_cursor=0; front_cursor<nums.length-1; front_cursor++)
            {
                for(int moving_cursor=front_cursor+1; moving_cursor<nums.length; moving_cursor++)
                {
                    if(nums[front_cursor]+nums[moving_cursor]<target)
                        max_sum=Math.max(max_sum, nums[front_cursor]+nums[moving_cursor]);
                }
            }
        }
        else if(target<=0)
        {
            // max_sum=nums[0];
            for(int front_cursor=0; front_cursor<nums.length-1; front_cursor++)
            {    
                for(int moving_cursor=front_cursor+1; moving_cursor<nums.length; moving_cursor++)
                {
                    if(nums[front_cursor]+nums[moving_cursor]<target)
                        if(front_cursor==0)
                            max_sum=nums[front_cursor]+nums[moving_cursor];
                        else
                            max_sum=Math.max(max_sum, nums[front_cursor]+nums[moving_cursor]);
                }
            }  
        }
        
        return max_sum;
	}
	
	public static void main(String[] args) {
//		SumOfTwoNumbersLessThanTarget.solve(new int[] {5, 1, 2, 3}, 2);
	}

}
