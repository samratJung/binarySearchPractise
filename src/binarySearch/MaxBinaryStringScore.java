package binarySearch;


/**
 * Total numbers of ones counted,
 * from left we move towards right till length-1, because we are comparing two numbers.
 * as we move on to right we accumulate both ones and zeroes count, which we compare with (total ones - number of ones that came till the cursor moved at that position) 
 * which is also equal to the number of ones int the right hand side. 
 */
public class MaxBinaryStringScore {

	public static int Solve(String s)
	{
		int max=0, zeroes=0, ones=0, total_ones=0;
		
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)=='1')
				total_ones++;
		}
		
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)=='1')
				ones++;
			else
				zeroes++;
			
			// comparing max value, Left handside having zeroes +( total ones - number of ones from the left hand side)
			max=Math.max(max, zeroes+(total_ones-ones));
		}
		
		return max;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(MaxBinaryStringScore.Solve("1111"));

	}

}
