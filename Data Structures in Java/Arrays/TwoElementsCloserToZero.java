/*

An Array of integers is given, both +ve and -ve. 
You need to find the two elements such that their sum is closest to zero.
For the below array, program should print -80 and 85

*/


public class TwoElementsCloserToZero{
	

	// Complexity:- O(n^2)
	private static void sumOfArray(int[] arr){

			int sum_close_to_zero = 1000;
			int num1 = 0;
			int num2 = 0;
			int temp = 0;
			for(int i=0;i<arr.length-1;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					temp = arr[i] + arr[j];
					
					if(getAbsValue(temp) < sum_close_to_zero)
					{
						sum_close_to_zero = getAbsValue(temp);
						
						num1 = arr[i];
						num2 = arr[j];	
					}
						
				}
					
			}
				
					
			System.out.println("The two elements are: "+num1 + " "+ num2);			

	}

	private static int getAbsValue(int temp){
			if(temp < 0)
				return (-1)*temp;
			else
				return temp;
	}


	// Method 2: Using Sorting
	// Algorithm
	/*
		1) Sort all the elements of the input array.
		2) Use two index variables l and r to traverse from left and right ends respectively. Initialize l as 0 and r as n-1.
		3) sum = a[l] + a[r]	
		4) If sum is -ve, then l++
		5) If sum is +ve, then r–
		6) Keep track of abs min sum.
		7) Repeat steps 3, 4, 5 and 6 while l < r Implementation

	*/
	private static void usingSorting(int[] arr){
		
		java.util.Arrays.sort(arr);
		int l = 0;
		int r = arr.length-1;
		int sum_close_to_zero = 1000;
		int num1 = 0;
		int num2 = 0;
		while(l < r){
			int temp = arr[l] + arr[r];
			if(temp < 0)
			{
				l++;
			}else if(temp > 0)
			{
				r--;
			}
				
			if(sum_close_to_zero > getAbsValue(temp))
			{
				sum_close_to_zero = getAbsValue(temp);
				num1 = arr[l];
				num2 = arr[r];
			}
		}

		System.out.println("The two elements using sorting are: "+num1+" "+num2);
	}



	public static void main(String args[]){

		int[] array = {1, 60, -10, 70, -80, 85};

		// Method 1 :- O(n^2)
		sumOfArray(array);

		// Method 2 :- O(nlogn)
		usingSorting(array);

	}
}