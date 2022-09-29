package binarySearch;

public class LengthOfLinkedList {

	class LLNode{
		int val;
		LLNode next;
	}
	
	class BackTrack{
		int length;
		
		BackTrack()
		{
			this.length=0;
		}
	}
	
	
	public BackTrack lengthOfLinkedlist(LLNode node)
	{
		if(node!=null)
		{
			BackTrack test= lengthOfLinkedlist(node.next);
			test.length++;
			return test;			
		}
		else
			return new BackTrack();
				
	}
	
	public int solve(LLNode node)
	{
		//Solution-1 via recursion
		//	return lengthOfLinkedList(node).length;
		
		//Solution two via normal traversal
		
		/*
		 *int length=0;
		 * while(node!=null)
		 * {
		 * 		node=node.next;
		 * 		length++;
		 * }
		 * 
		 */
	}


}
