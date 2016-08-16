public class selectionSort{
	

	public static void main(String args[]){

		int[] array = {64,25,12,22,11};

		System.out.println("Array before Sorting: ");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}

		// The logic for insertion sort is :
		// For each iteration find minimum and swap so that the
		// smallest element is always at the start of the array.
		int min;
		for(int i=0;i<array.length;i++){
			min = i;
			for(int j=i+1;j<array.length;j++){
				if(array[min] > array[j]){
					min = j; // Minimum Found
				}
			}
			// Now swap the elements
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;

		}

		System.out.println();
		System.out.println("After Sorting the array is: ");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}




	}


}

// Notes:-
// 1. The worst case time complexity for Selection Sort is O(n^2);
