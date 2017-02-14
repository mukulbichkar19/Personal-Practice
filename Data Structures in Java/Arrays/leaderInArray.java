/*
Write a program to print all the LEADERS in the array. 
An element is leader if it is greater than all the elements 
to its right side. 
And the rightmost element is always a leader. 
For example int the array {16, 17, 4, 3, 5, 2}, 
leaders are 17, 5 and 2.

Let the input array be arr[] and size of the array be size.
*/
public class leaderInArray{

	private static void usingScan(int[] arr){

		int max_so_far = 0;
		
		for(int i=arr.length-1;i>=0;i--){
			int prev_max = max_so_far;	
			if(max_so_far < arr[i])
				max_so_far = arr[i];
			if(max_so_far != prev_max)
				System.out.print(max_so_far + " ");	
		}
		System.out.println();
	}
	

	public static void main(String args[]){

		int[] array = {16, 17, 4, 3, 5, 2};

		System.out.println("The leaders in this array are: ");
		usingScan(array);



	}
}