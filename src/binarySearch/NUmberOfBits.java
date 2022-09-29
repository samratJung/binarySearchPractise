package binarySearch;

import java.util.*;

class NUmberOfBits {
    public int solve(int n) {
        if(n==1)
            return 1;
        if(n==0)
            return 0;

        int bit_count=0;
        while(n!=0)
        {
            if(n%2!=0)
                bit_count++;
            n/=2;
        }
        return bit_count;
    }
}