package binarySearch;

import java.util.Arrays;
/**
 * 
 * First, Sort the given arrays.
 * once the arrays is sorted compare the first two pairs with the last pair which would cover all the test cases for max value.
 *
 */

public class MaxProuctOfTwoNumbers {

    public static int solve(int[] nums) {
        Arrays.sort(nums);
        int cursor = nums.length;
        
        if(cursor<2)
        	return 0;
        else
        	return nums[cursor-1]*nums[cursor-2]>nums[0]*nums[2]?nums[cursor-1]*nums[cursor-1]:nums[0]*nums[1];

    }
	public static void main(String[] args) {
		System.out.println(MaxProuctOfTwoNumbers.solve(new int[] {-3,-2,2}));
	}

}
