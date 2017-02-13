public class rotateArray{
	

	private static void iterativeRotate(int[] array){

		int start = 0;
		int end = array.length-1;

		while(end > start){
			int temp = array[end];
			array[end] = array[start];
			array[start] = temp;
			start++;
			end--;
		}
		System.out.println("The rotated array using iterative method is: ");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();

	}

	private static void recursiveRotate(int[] array, int start, int end){

		if(end > start)
			return;
		int temp = array[start];
		array[start] = array[end];
		array[end] = temp;
		recursiveRotate(array, start++, end--);
		

	}

	public static void main(String args[]){

		int[] array = {1,2,3,4,5,6};
		
		// Iterative Method:- O(n)
		iterativeRotate(array);

		// Recursive Method:- O(n) Space:- O(n)
		recursiveRotate(array,0,array.length-1);
		System.out.println("The rotated array using recursive method is: ");
		for(int i=0;i<array.length;i++)
			System.out.print(array[i] + " ");
		System.out.println();




		
	}
}