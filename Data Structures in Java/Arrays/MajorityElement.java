/*

GeeksForGeeks Problem 2

Majority Element: A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element)

Write a function which takes an array and emits the majority element (if it exists), otherwise prints NONE as follows:

       I/P : 3 3 4 2 4 4 2 4 4
       O/P : 4

       I/P : 3 3 4 2 4 4 2 4
       O/P : NONE


Three Methods:-
1. Brute Force O(n^2), space - O(1)
2. Sorting O(nlgn), space - O(1) //Does not help in here sod discard
3. HashMap O(n) Space:- O(m), m is the count of unique elements in arr[n]
4. Moore's Voting Algorithm. O(n), space - O(1)

*/
public class MajorityElement{


	private static int bruteForce(int[] array){
		int max_count = 0;
		int max_element = 0;
		for(int i=0;i<array.length;i++){
			int count = 1;
			for(int j=i+1;j<array.length;j++){
				if(array[i] == array[j]){
					count++;
				}
			}
			if(count > max_count){
				max_count = count;
				max_element = array[i];
			}
		}
		if(max_count > array.length/2){
			return max_element;
		}
			return -1;

	}

	private static int usingSort(int[] array){
			java.util.Arrays.sort(array);

			// for(int i=0;i<array.length;i++){
			// 	System.out.print(array[i] + " ");
			// }
			int max_count = 0;
			int max_element = 0;

			for(int i=0,j=i+1; i<array.length && j<array.length;){

				int count = 1;

				while(j<=array.length-1 && array[i]==array[j] ){
					count++;
					j++;

				}

				if(max_count < count){
					max_count = count;
					max_element = array[i];
				}
				// System.out.println("For i at: "+i+" and j : "+j+" and count: "+count);
				i = j;
				j = i+1;
				// System.out.println("For i at new pos: "+i+" and j at new pos: "+j+" and count: "+count);



			}

			if(max_count > array.length/2){
				return max_element;
			}else{
				return -1;
			}


	}

	// Using HashMap
	private static int usingHashMap(int[] array){

		java.util.Map<Integer, Integer> hashmap = new java.util.HashMap<>();
		for(int i=0;i<array.length;i++){

			if(hashmap.containsKey(array[i])){
				int count = hashmap.get(array[i]) + 1;
				hashmap.put(array[i],count);
				if(count > array.length/2){
					return array[i];
				}
			}else{
				hashmap.put(array[i],1);
			}

		}
		return -1;

	}

	// Moore's Voting Algorithm
	private static int usingMoore(int[] array){

		// Step 1 Finding the Max element
		int majority_index = 0;
		int count = 1;
		for(int i=1;i<array.length;i++){
			if(array[majority_index] == array[i])
				count++;
			else
				count--;
			if(count == 0){
				majority_index = i;
				count = 1;
			}
		}



		// Step 2: Verify whether the predicted maximum is really the majority
		int majority_count = 0;
		for(int i=0;i<array.length;i++){
			if(array[i]==array[majority_index]){
				majority_count++;
			}
		}
		if(majority_count > array.length/2){
			return array[majority_index];
		}else{
			return -1;
		}

	}



	public static void main(String args[]){



		int[] array = {3,3,4,2,4,4,2,4	};

		// Using Brute Force
		int max = bruteForce(array);
		if(max != -1)
			System.out.println("The max element using brute force is: "+max);
		else
			System.out.println("NONE");

		// Using Sorting
		int max_element = usingSort(array);
		if(max_element != -1)
			System.out.println("The max element using sort is: "+max_element);
		else
			System.out.println("NONE");

		// Using HashMap
		int max_element_2= usingHashMap(array);
		if(max_element_2 != -1)
			System.out.println("The max element using HashMap is: "+max_element_2);
		else
			System.out.println("NONE");


		// Moore's Voting Algoritm
		// Step 1: Find the Majority element
		// Step 2: Check the majority element is really majority
		int max_element_3= usingMoore(array);
		if(max_element_3 != -1)
			System.out.println("The max element using Moore is: "+max_element_3);
		else
			System.out.println("NONE");









	}
}
