/*

Search an element in a sorted and rotated array
An element in a sorted array can be found in O(log n) time via binary search. But suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand. So for instance, 1 2 3 4 5 might become 3 4 5 1 2. Devise a way to find an element in the rotated array in O(log n) time.

*/
public class searchElementRotatedArray{
	
	public static void main(String args[]){

		int[] rotatedArray = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		// Method 1
		// 1. Find the pivot i.e. the point where array is rotated.
		// 2. After finding the pivot call binary serach in either
		//    left or right array.
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the element to be searched: ");
		int n = scan.nextInt();
		int pos = pivotSearch(rotatedArray, n);
		if(pos!=-1)
			System.out.println("The element "+n+" is at position: "+pos);
		else
			System.out.println("Element is not present in the array");

		// Method 2
		// Find the mid and search in the first sorted array from low to mid
		// and then search from mid to high if the first case fails
		int pos1 = searchSimple(rotatedArray,0,rotatedArray.length-1,n);
		if(pos1!=-1)
			System.out.println("The element "+n+" is at position: "+pos1);
		else
			System.out.println("Element is not present in the array");
	}

	private static int pivotSearch(int[] rotatedArray, int key){

		int pivot = findPivot(rotatedArray,0,rotatedArray.length-1);
		//System.out.println("The pivot is at position: "+pivot);
		if(rotatedArray[pivot] == key){
			return pivot;
		}
		if (pivot == -1)
			return binarySearch(rotatedArray,0,rotatedArray.length-1,key);
		if(rotatedArray[0] <= key)
			return binarySearch(rotatedArray,0,pivot-1,key);
		return binarySearch(rotatedArray,pivot+1,rotatedArray.length-1,key);
	}

	private static int findPivot(int[] rotatedArray,int low, int high){

		// Base Cases
		if(low>high)
			return -1;
		if(low==high)
			return low;
		int mid = (low+high)/2; //Initialize mid
		if(low < mid && rotatedArray[mid] > rotatedArray[mid+1])
			return mid;
		if(high > mid && rotatedArray[mid-1] > rotatedArray[mid])
			return mid-1;
		if(rotatedArray[low] >= rotatedArray[mid])
			return findPivot(rotatedArray,low,mid-1);
		return findPivot(rotatedArray,mid+1,high);

	}

	private static int binarySearch(int[] arr, int low, int high, int key){

		if(high < low)
			return -1;
		int mid = (low+high)/2;
		if(arr[mid] == key)
			return mid;
		if(key > arr[mid])
			return binarySearch(arr,mid+1,high,key);	
		return binarySearch(arr, low,mid-1,key);

	}

	private static int searchSimple(int[] arr, int low, int high, int key){

		if(low > high)
			return -1;
		int mid = (low+high)/2;
		if(arr[mid] == key)
			return mid;
		// If arr[low..mid] is sorted
		if(arr[low] <= arr[mid]){
			if(key>=arr[low] && arr[mid] >= key)
				return searchSimple(arr,low,mid-1,key);
			return searchSimple(arr,mid+1,high,key);
		}
		if(key >= arr[mid] && key <= arr[high])
			return searchSimple(arr,mid+1,high,key);
		return searchSimple(arr,low,mid-1,key);

	}


}