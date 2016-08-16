public class BubbleSort{
	



	public static void main(String args[]){

		int[] array = {5,1,4,2,8};

		System.out.println("Before Sorting array is: ");
		for(int i=0;i<array.length;i++)
		{

			System.out.print(array[i]+" ");
		}

		System.out.println();

		for(int i=0;i<array.length-1;i++){

			for(int j=0;j<array.length-i-1;j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}

		System.out.println("After Sorting the array is: ");
		for(int i=0;i<array.length;i++){

			System.out.print(array[i]+" ");
		}

		System.out.println();
		System.out.println("------------- Optimized ---------------");
		// Optimized Version of Bubble Sort
		boolean swapped = false;
		for(int i=0;i<array.length-1;i++){
			swapped = false;
			for(int j=0;j<array.length-i-1;j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swapped = true;
				}
			}
			if(swapped == false){
				break;
			}
		}

		System.out.println("After Sorting the array (Optimized version) is: ");
		for(int i=0;i<array.length;i++){

			System.out.print(array[i]+" ");
		}




	}


}

// RunTime Complexity
// 1. The worst case time complexity is O(n^2);
// 2. The optimized version skips some passes;
