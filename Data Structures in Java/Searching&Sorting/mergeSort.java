public class mergeSort{
	

	public void merge(int[] arr,int l,int m,int r){

		// Find the sizes of two subarrays to be merged
		int n1 = m-l+1;
		int n2 = r-m;

		// Create temp arrays
		int L[] = new int[n1];
		int R[] = new int[n2];

		// Copy data to temp arrays
		for(int i=0;i<n1;i++){
			L[i] = arr[l+i];
		}
		for(int j=0;j<n2;j++){
			R[j] = arr[m+1+j];
		}

		// Merge the temp arrays
		int i =0, j=0;

		int k = l;
		while(i<n1 && j<n2){
			if(L[i] <= R[j]){
				arr[k] = L[i];
				i++;
			}
			else{
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements
		while(i<n1){
			arr[k] = L[i];
			i++;
			k++;
		}

		while(j<n2){
			arr[k] = R[j];
			j++;
			k++;
		}



	}



	public void sort(int[] arr, int l,int r){

		if(l < r){

			// Find middle element
			int m = (l+r)/2;

			// Sort first and second halves
			sort(arr,l,m);
			sort(arr,m+1,r);

			// merge the sorted halves
			merge(arr,l,m,r);

		}



	}




	public static void main(String args[]){

		int[] arr = {12,11,13,5,6,7};

		System.out.println("The array before sorting is: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

		mergeSort obj = new mergeSort();

		obj.sort(arr,0,arr.length-1);  //Call sort method.

		System.out.println();
		System.out.println("The array after sorting is: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}




	}
}