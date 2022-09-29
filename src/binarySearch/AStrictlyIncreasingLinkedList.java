package binarySearch;

class BackTrack
{
	int num;
	boolean isGreater;
	
	BackTrack()
	{
		this.num=Integer.MAX_VALUE;
		this.isGreater=true;
	}
	
}

class LLNode
{
	int val;
	LLNode next;
}

public class AStrictlyIncreasingLinkedList {
	
	//Approach 1 using backtracking and recursion
	
	public BackTrack isLListStrictlyIncreasingOrder(LLNode node)
	{
		if(node!=null)
		{
			BackTrack test = isLListStrictlyIncreasingOrder(node.next);
			
			if(test.num>node.val)
			{
				test.num=node.val;
				return test;
			}
			else
			{
				test.isGreater=false;
				return test;
			}
		}
		else
		{
			return new BackTrack();
		}
	}
	
	//Approach 2 by finding length of the node, traversing upto length-1 of the node while simultaneously comparing the node value.
	public boolean solve(LLNode head)
	{
		int length =0;
		LLNode dup_node= head;
		
		while(dup_node!=null)
		{
			length++;
			dup_node=dup_node.next;
		}
		
		for(int i=0; i<length-1; i++)
		{
			if(head.val<head.next.val)
			{
				head=head.next;
				continue;
			}
			else
				return false;
		}
		return true;
		
		
		// for first method: return isLListStrictlyIncreasingOrder(head).isGreater;
	}
	
	
}
