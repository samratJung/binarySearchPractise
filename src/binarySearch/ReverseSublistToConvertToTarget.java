package binarySearch;

import java.util.*;

public class ReverseSublistToConvertToTarget {
    public boolean solve(int[] nums, int[] target) {
        
        Arrays.sort(nums);
        Arrays.sort(target);

        if(target.length!=nums.length)
            return false;
            
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==target[i])
                continue;
            else
                return false;
        }

        return true;

    }
}
