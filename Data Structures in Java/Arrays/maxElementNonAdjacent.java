/*

Maximum sum such that no two elements are adjacent
Given an array of positive numbers, find the maximum sum of a subsequence with the constraint 
that no 2 numbers in the sequence should be adjacent in the array. 
So 3 2 7 10 should return 13 (sum of 3 and 10) or 3 2 5 10 7 should return 15 (sum of 3, 5 and 7)
Dynamic Programming 

*/
public class maxElementNonAdjacent{
	

	private static int findMaxSum(int[] arr){

		// The algorithm is to maintain two sums 
		// incl and excl, where incl is the sum including the current number
		// and excl is the sum excluding the current number
		int incl = arr[0];
		int excl = 0;
		int temp;
		for(int i=1;i<arr.length;i++){
			temp = incl;
			incl = findmax(temp, excl + arr[i]); // New Incl which is max of old incl, and the sum of old excl and current element
			excl = temp;
		}	
		return findmax(incl,excl);
	}

	private static int findmax(int num1, int num2){
		
		if(num1 == num2)
			return num1;
		else if(num1 > num2)
			return num1;
		else 
			return num2;
	}


	public static void main(String args[]){

		int[] arr= {5, 5, 10, 40, 50, 35};
		int max = findMaxSum(arr);
		System.out.println("The max sum of non adjacent elements: ");
		System.out.println(max);



	}
}