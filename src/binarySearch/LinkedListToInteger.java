package binarySearch;

public class LinkedListToInteger {
/*
 * Find the length of the node, 
 * traverse the length time to that node;
 */
	class LLNode {
		    int val;
		    LLNode next;
	}
	
    public int solve(LLNode node) {
        
        LLNode head = node;
        LLNode copyHead =node;

        int length=0, binary_sum=0;

        while(copyHead!=null)
        {
            length++;
            copyHead=copyHead.next;
        }
        
        for(int i=length; i>0; i--)
        {
            if(head.val==1)
                binary_sum+=Math.pow(2,i-1);
            head=head.next;
        }

        return binary_sum;

    }

}
