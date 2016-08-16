public class radixSort{
	

	static int getMax(int[] arr,int n){
		int max = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}

	static void countSort(int[] arr,int n,int exp){

		int[] output = new int[n]; // output array
		int i;
		int[] count = new int[10];
		for (i = 0; i < n; i++)
            count[ (arr[i]/exp)%10 ]++;
 
        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        // Build the output array
        for (i = n - 1; i >= 0; i--)
        {
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
            count[ (arr[i]/exp)%10 ]--;
        }
 
        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to curent digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];





	}









	static void radixsort(int[] arr,int n){

		// Find Maximum number to know the umber of digits
		int m = getMax(arr,n);
		
		// Do counting sort for every digit. Note that instead
        // of passing digit number, exp is passed. exp is 10^i
        // where i is current digit number
        for (int exp = 1; m/exp > 0; exp *= 10)
            countSort(arr, n, exp);

	}



	public static void main(String args[]){

		int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
		radixsort(arr,arr.length);	
		System.out.println("After sorting array is: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}


	}



}