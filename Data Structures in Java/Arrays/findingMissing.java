/*

Find the Missing Number
You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in list. One of the integers is missing in the list. Write an efficient code to find the missing integer.

Example:
I/P    [1, 2, 4, ,6, 3, 7, 8]
O/P    5

Ways:-
1. Sort and check for missing number. O(n*lgn)
2. Find sum of existing array and then subtract it from the 
   sum of integers in that range.  Also XOR can be done similarly. O(n)

*/

public class findingMissing{
	

	private static void usingSort(int[] array){
		java.util.Arrays.sort(array);
		for(int i=0;i<array.length-1;i++){
			int j = i+1;
			if(array[j]-array[i]!=1){
				System.out.println("The missing element using sort is: "+(array[i]+1));
			}
		}		
	}

	private static void usingSum(int[] array){
		// initialize min,max, and sum
		int min = array[0];
		int max = -1;
		int sum_of_array = 0;
		int sum_of_range= 0;
		for(int i=0;i<array.length;i++){
			if(array[i] > max)
				max = array[i];
			if(array[i] < min)
				min = array[i];
			sum_of_array += array[i];
		}

		for(int i=min;i<=max;i++){
			sum_of_range += i;
		}
		int sum_diff = sum_of_range-sum_of_array;
		if(sum_diff > 0)
			System.out.println("The missing number using sum is: "+sum_diff);

	}



	public static void main(String args[]){

		int[] array = {1,2,4,5,6,3,7,8};

		usingSort(array);

		usingSum(array);

	}
}


