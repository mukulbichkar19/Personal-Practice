public class spansStock{
	

	public static void main(String args[]){

		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = scan.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the values: ");
		for(int i=0;i<array.length;i++){
			array[i] = scan.nextInt();
		}
		int[] span = new int[n];
		// The complexity is O(n^2)
		for(int i=0;i<array.length;i++){
			int spancount = 1;
			int j = i-1;
			while(j>=0 && array[j]<=array[j+1]){
				spancount++;
				j--;
			}
			span[i] = spancount;
		}
		System.out.println("The spans array is: ");
		for(int i=0;i<span.length;i++){
			System.out.println(span[i]);
		}




	}
}