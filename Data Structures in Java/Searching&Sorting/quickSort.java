public class quickSort{
	
	private int partition(int[] arr,int low, int high){

		// Select the last element in the array as the pivot
		int pivot = arr[high];
		int i = (low-1); // Start i with one position to the left of low
		// The following for loop goes from low to last element index-1.
		for(int j = low;j<=high-1;j++){

			// If current element is smaller than or equal the pivot,
			// then increment i and swap i and j 
			if(arr[j] <= pivot){

				i++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;	

			}
		}

		// swap arr[i+1] with arr[high] i.e. place pivot in the right position
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;

		return i+1;



	}





	private void sort(int[] arr,int low, int high){

		if(low<high){

			// pi is the partitioning index, at the end of partitioning
			// arr[pi] is in the right position
			int pi = partition(arr,low,high);

			// Now recursively sort the elements before partition
			sort(arr,low,pi-1);
			// Now recursively sort the elements after partition
			sort(arr,pi+1,high);



		}



	} 




	public static void main(String args[]){

			int[] arr = {10, 80, 30, 90, 40, 50, 70};

			System.out.println("Array before Sorting is: ");
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}

			quickSort obj = new quickSort();
			obj.sort(arr,0,arr.length-1);
			System.out.println();
			System.out.println("The sorted array is: ");
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}


	}
}

// The best case time complexity is O(nlogn)
// The worst case is O(n^2)
