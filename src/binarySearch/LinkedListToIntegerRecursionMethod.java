package binarySearch;

public class LinkedListToIntegerRecursionMethod {
	
	class LLNode { 
		
		int val;
		LLNode next;
	}
	
	class test {
		int sum;
		int depth;
		
		test() 
		{
			
			
			this.sum = 0;
			this.depth = 0;
		}
		
		test(int sum, int depth) {
			this.sum = sum;
			this.depth = depth;
		}
	}
	
	
	class Solution {
		public int solve(LLNode node) {
			
			return findDecimal(node).sum; 
			
		}
		
		public test findDecimal(LLNode node){
			
			if(node != null)
			{
				test temp = findDecimal(node.next);
				
				if(node.val==1)
					temp.sum+=Math.pow(2,temp.depth);
				
				temp.depth++;
				
				return temp;
				
			}
			else
			{
				return new test();
			}
		}
	}
	
}












		
		
		
