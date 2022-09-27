package binarySearch;

import java.util.Scanner;

public class PalindromeStringAndDigit {

	public static boolean check(String str)
	{
		int front_cursor=0, last_cursor=str.length()-1;
		
		while(front_cursor<=last_cursor)
		{
			if(str.charAt(front_cursor)==str.charAt(last_cursor))
			{
				front_cursor++;
				last_cursor--;
			}
			else
				return false;
		}
		return true;
	}
	
	public static boolean check(int num)
	{
        int count=0, dup=num, duplicate_num=num, duplicate_num2=num, compare_num=0;
		
		//find the length
		while(dup!=0)
		{
			dup=dup/10;
			count++;
		}
		
		//reverse the number by extracting and multiplying power;
		
		for(int i=count-1; i>=0; i--)
		{
            compare_num +=(duplicate_num % Math.pow(10,1) * Math.pow(10, i));;
            duplicate_num=duplicate_num/10;
		}
		
		if(compare_num==duplicate_num2)
			return true;
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(PalindromeStringAndDigit.check("ap"));
		System.out.println(PalindromeStringAndDigit.check("naman"));
		System.out.println(PalindromeStringAndDigit.check("craparc"));
		System.out.println(PalindromeStringAndDigit.check(12321));
		System.out.println(PalindromeStringAndDigit.check(123));	
	}

}
