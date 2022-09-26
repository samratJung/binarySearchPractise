package binarySearch;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SumOfTwoNumbersLessThanTarget {

	public static int solve(int[] nums, int target)
	{
		Arrays.sort(nums, Collections.reverseOrder());
		for(int i=0; i<nums.length; i++)
		{
			System.out.println(nums[i]);
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digits[] ={"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight","Nine"};
        String ten_places[] ={"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		SumOfTwoNumbersLessThanTarget.solve(new int[] {5, 1, 2, 3}, 2);
	}

}
