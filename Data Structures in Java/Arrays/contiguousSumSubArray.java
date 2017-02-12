/*

Largest Sum Contiguous Subarray
Write an efficient C program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.


Kadane’s Algorithm:

Initialize:
    max_so_far = 0
    max_ending_here = 0

Loop for each element of the array
  (a) max_ending_here = max_ending_here + a[i]
  (b) if(max_ending_here < 0)
            max_ending_here = 0
  (c) if(max_so_far < max_ending_here)
            max_so_far = max_ending_here
return max_so_far
Explanation:
Simple idea of the Kadane's algorithm is to look for all positive contiguous segments of the array (max_ending_here is used for this). And keep track of maximum sum contiguous segment among all positive segments (max_so_far is used for this). Each time we get a positive sum compare it with max_so_far and update max_so_far if it is greater than max_so_far


*/



public class contiguousSumSubArray{


	private static void findMaxSubArray(int[] array){

		// Initialize max_so_far, max_ending_here
		int max_so_far = 0;
		int max_ending_here = 0;
		int start_index = 0;
		int end_index = 0;
		int s= 0;

		for(int i=0;i<array.length;i++){
			
			max_ending_here += array[i];

			if(max_ending_here < 0){
				max_ending_here = 0;
				s = i+1;
			}else if(max_ending_here > max_so_far){
				max_so_far = max_ending_here;
				start_index = s;
				end_index = i;
			}
		}

		if(max_so_far == 0 && start_index > array.length-1){
			System.out.println("Array contains all negative elements");
		}else{
			System.out.println("The max sum is: "+max_so_far + " with start index: "+start_index+" and end index: "+end_index);
		}

		
	}
	

	public static void main(String args[]){

		int[] array = {-2,-3,4,-1,-2,1,-5,-3};
		findMaxSubArray(array);



	}
}