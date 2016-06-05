public class SortingArray{
	


	public static void main(String args[]){

			java.util.Scanner scan = new java.util.Scanner(System.in);
			int n;
			int[] arr;
			n = scan.nextInt(); //Accept the no. of array elements
			// Accept actual array elements
			arr = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = scan.nextInt();
			}

			// Way 1: Time Complexity O(n) and Space Complexity O(n)
			int[] reversearr = new int[n];
			for(int i=0,j=n-1;i<n && j>=0;i++,j--)
			{
				reversearr[i] = arr[j];
			}
			// Print reverse array
			System.out.println("The reversed array is: ");
			for(int i=0;i<n;i++){
				System.out.print(reversearr[i]+" ");
			}
			System.out.println();

			System.out.println("-------------------------------");
			// Way 2 : In place sorting time complexity O(n) and space complexity O(1)
			int temp; // a temp variable for storing.
			int end = n;
			for(int i=0;i<n;i++)
			{
				temp = arr[i];
				arr[i]=arr[end-1];
				arr[end-1] = temp;
				end--;
			}
			// Print reverse array
			System.out.println("The reversed array is: ");
			for(int i=0;i<n;i++){
				System.out.print(reversearr[i]+" ");
			}


	}
}