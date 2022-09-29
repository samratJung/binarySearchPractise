package binarySearch;

import java.util.Arrays;
import java.util.List;

public class RotateListInLeftByK {

	public static int [] solve(int[] nums, int k)
	{
		int place_holder;
		
		if(nums.length==k)
			return nums;
		
		for(int i=k; i<nums.length; i++)
		{
			place_holder=nums[i-k];
			nums[i-k]=nums[i];
			nums[i]= place_holder;
		}
		
		return nums;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int [] dup = RotateListInLeftByK.solve(new int[] {1,2,3,4,5,6}, 5);
//		System.out.println(dup);

		int [] nums =new int[] {1,2,3,4,5,6};
		int place_holder;
		int k=4;
		
		if(nums.length==k)
			for(int x: nums)
				System.out.println(x);
		
		for(int i=k; i<nums.length; i++)
		{
			place_holder=nums[i-k];
			nums[i-k]=nums[i-1];
			nums[i-1]= place_holder;
		}
		
		for(int x: nums)
		{
			System.out.print(x + " ");
		}
		
	}

}
