package binarySearch;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


/**
 * As you interate through your string, keep inserting the unique character extracted from the string in Map
 * as Key, while checking everytime before the insertion if same key has been in the current cursor for insertion
 * in the Key. If there is no same key than the program returns -1, but if same key occurs while iterating over the 
 * string than the position of the string is returned, 
 * 
 */


public class RecurringCharacter {

	public static int Solve(String s)
	{
		Map<String, Integer> alphabetList = new HashMap<>();
		
		for(int i = 0; i<s.length(); i++)
		{
			if(!alphabetList.containsKey(Character.toString(s.charAt(i))))
				alphabetList.put(Character.toString(s.charAt(i)), i);
			else
				return i;
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
	    
		System.out.println(RecurringCharacter.Solve("abcdefgg"));
	    
	}
	
}
	    
	


