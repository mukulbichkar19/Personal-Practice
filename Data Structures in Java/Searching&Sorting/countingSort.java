public class countingSort{
	

	void counting(int[] arr){

		int length = arr.length;

		int max = 0;
		// Find the range
		for(int i=0;i<length;i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		//System.out.println("The lower end of range is "+max);
		int[] count_arr = new int[max+1];


		// Store the count of each number
		for(int i=0;i<length;i++){
			count_arr[arr[i]]=count_arr[arr[i]]+1;
		}

		// Add the previous elements in the array
		for(int i=1;i<max+1;i++){
			count_arr[i] += count_arr[i-1];
		}

		int[] output = new int[length];

		for(int i=0;i<length;i++){
			output[count_arr[arr[i]]-1] = arr[i];
			count_arr[arr[i]] = count_arr[arr[i]]-1;
		}

		System.out.println();
		System.out.println("The sorted array is: ");
		for(int i=0;i<length;i++){
			System.out.print(output[i]+" ");
		}



	}



	public static void main(String args[]){


		int[] arr = {1,4,1,2,7,5,2,9};
		System.out.println("The array before sorting is: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

		countingSort s = new countingSort();
		s.counting(arr);




	}
}