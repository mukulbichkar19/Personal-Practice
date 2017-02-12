/*
	Binary Search : Applicable to a sorted array
	Searches an element in O(logn) time.
*/

public class BinarySearch{
	
	public static void main(String[] args){

		int[] array = {1,2,3,4,5,6,7,8,9};

		int low = 0;
		int high = array.length-1;
		int mid = (low+high)/2;
		boolean flag = false;

		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the element to be searched: ");
		int key = scan.nextInt();

		//System.out.println("High and low is: "+high+" : "+low + " and mid: "+mid);

		while(low <= high){

			mid = (low+high)/2;

			if(array[mid] == key){
				System.out.println("Element Found");
				flag = true;	
				break;
			}
			else if(array[mid] < key){
				
				low = mid+1;
			}
			else if(array[mid] > key){
				
				high = mid-1;
			}

		}
		if(!flag){

				System.out.println("Element not found");
		
		}






	}
}