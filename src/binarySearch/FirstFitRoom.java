package binarySearch;

public class FirstFitRoom {
	/**
	 * Basic array iteration, but the program is very slow.
	 * Should try another approach
	 */
	public static int Solve(int [] rooms, int target)
	{
		for(int i=0; i<rooms.length; i++)
		{
			if(rooms[i]>=target)
				return rooms[i];
		}
		
		return -1;
	}
	public static void main(String[] args) {
		
		System.out.println(FirstFitRoom.Solve(new int[] {15,20,30,50,25}, 20));

	}

}
