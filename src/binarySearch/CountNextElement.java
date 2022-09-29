package binarySearch;

import java.util.*;


class CountNextElement {
    public int solve(int[] nums) {
        
        Map<Integer, Integer> list = new HashMap<>();
        int sum=0;

        for(int i=0; i<nums.length; i++)
        {
            if(list.containsKey(nums[i]))
            {
                list.put(nums[i], list.get(nums[i])+1);
            }
            else
                list.put(nums[i], 1);    
        }

        for(int i=0; i<nums.length; i++)
        {
            if(list.containsKey(nums[i]+1))
            {
                sum+=list.get(nums[i]);
                //*this is so that reptition doesn't occur
                list.put(nums[i], 0);
            }
        }

        return sum;
    }
}
