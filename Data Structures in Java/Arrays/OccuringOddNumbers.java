/*

Given an array of positive integers. All numbers occur even number of times except one number which occurs odd number of times. Find the number in O(n) time & constant space.

Example:
I/P = [1, 2, 3, 2, 3, 1, 3]
O/P = 3

// Ways to solve this problem:-
// 1. Brute Force:- O(n^2)
// 2. Sorting:- O(n*lgn)
// 3. HashMap:- O(n), space:- O(m) m<n
// 4. Using Bitwise XOR
*/

public class OccuringOddNumbers{
	


	public static void main(String args[]){


		int[] array = {1,2,3,2,3,1,3};
		int xor_result = 0;
		for(int i=0;i<array.length;i++){
			xor_result = array[i]^xor_result;
		}
		System.out.println("The number occuring odd number of times is: "+xor_result);


	}
}