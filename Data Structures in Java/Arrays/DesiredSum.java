/*

GeeksForGeeks Problem 1

Given an array A[] and a number x, check for pair in A[] with sum as x

Three Methods:-
1. Brute Force O(n^2)
2. Sorting O(nlgn)
3. HashMap O(n) Space:- O(m), m is the count of unique elements in arr[n]

*/

import java.util.Arrays;

public class DesiredSum{
	


	private static boolean bruteForce(int[] arr, int target){

		for(int i=0;i<arr.length;i++){
			
			int rem = target - arr[i];
			for(int j=0;j<arr.length;j++){

				if(arr[j] == rem && i!=j){
					
					System.out.println("Pair exists as "+arr[i]+" "+arr[j]);
					return true;

				}
			}
		}
		return false;
	}


	// Using Sorting
	private static boolean usingSorting(int[] arr, int target){

		//Currently using in-built sorting provided by java.
		Arrays.sort(arr);
		int lower = 0;
		int upper = arr.length-1;
		while(lower < upper){
			int sum = arr[lower] + arr[upper];
			if(sum > target){
				upper--;
			}else if(sum < target){
				lower++;
			}
			else if(sum == target){
				System.out.println("Pair exists as "+arr[upper]+" "+arr[lower]);
				return true;
			}
		}
		return false;

	}


	// Using HashMap
	private static boolean usingHashMap(int[] arr, int target){


		java.util.Map<Integer, Integer> hashMap = new java.util.HashMap<Integer, Integer>();

		for(int i=0;i<arr.length;i++){
			if(hashMap.containsKey(arr[i])){
				int count = hashMap.get(arr[i]) + 1; //Update value
				hashMap.put(arr[i],count);
			}else{
				hashMap.put(arr[i],1);
			}
		}
		// for(java.util.Map.Entry<Integer, Integer> entry: hashMap.entrySet()){
			
		//}

		for(int i=0;i<arr.length;i++){
			
			int rem = target-arr[i];
			if(hashMap.containsKey(rem)){
				System.out.println("Pair exists as: "+arr[i] + " & "+rem);
				return true;
			}
		}

		return false;
	}

	public static void main(String args[]){

		int[] array = {5,8,3,18,9,1,3,7,8,5,5,8,8,8};

		java.util.Scanner scan = new java.util.Scanner(System.in);

		System.out.println("Enter the target: ");
		int target = scan.nextInt();

		//Method 1 Brute Force
		if(bruteForce(array,target)){
			System.out.println("");
		}else{
			System.out.println("Pair does not exists");
		}

		// Using Sorting
		if(usingSorting(array, target)){
			System.out.println("");
		}
		else{
			System.out.println("Pair does not exists");
		}

		if(usingHashMap(array, target)){
			System.out.println("");
		}else{
			System.out.println("Pair does not exists");
		}

		




	}


}