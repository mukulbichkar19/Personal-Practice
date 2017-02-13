public class rotateByN{
	

	private static void usingTempArray(int[] array, int d){

		int temp[] = new int[d];
		for(int i=0;i<d;i++){
			temp[i] = array[i];
		}
		System.out.println("Temp array is: ");
		for(int i=d,j=0;i<array.length && j<array.length-d;i++,j++){
			array[j] = array[i];
		}
		for(int i=array.length-d,j=0;i<array.length && j<d;i++,j++){
			array[i] = temp[j];
		}
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+ " ");
		System.out.println();

	}

	private static void usingRotationOneBy(int[] array, int d){


		
		for(int i=0;i<d;i++)
			rotateOne(array);
		System.out.println("The rotated Array by method 2 is: ");
		for(int i=0;i<array.length;i++)
			System.out.print(array[i] + " ");
		

	}

	private static void rotateOne(int[] array){
		
		int i;
		int temp = array[0];
		//System.out.println("The array for each iteration is: "+temp);
		//for(int j=0;j<array.length;j++)
		//	System.out.println(array[j]);

		for(i=0;i<array.length-1;i++){
			array[i] = array[i++];
		}
		array[i] = temp;
		
	}

	// Method 3: Using Reverse
	private static void usingReverse(int[] array,int d){
		
		reverse(array,0,d-1);
		reverse(array,d,array.length-1);
		reverse(array,0,array.length-1);

		System.out.println("Rotated array after reversal: ");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	
	}

	//Helper Method reverse array
	private static void reverse(int[] arr, int start, int end){

		while(end > start){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String args[]){

		int[] array = {1,2,3,4,5,6,7};
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the elements by how much you want to rotate: ");
		int d = scan.nextInt();

		//Method 1: Using temp array
		usingTempArray(array, d);

		// Method 2: Using Rotation one by one
		//usingRotationOneBy(array,d);

		// Method 3: Using Reverse
		int[] new_array = {1,2,3,4,5,6,7};
		usingReverse(new_array,d);

		// Method 4: Block Swap Not Understood


	}
}