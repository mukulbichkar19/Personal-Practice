public class medianofTwoSortedArrays{
	

	public static void main(String args[]){

		// Both the arrays are of same size and even in length
		int[] array1 = {1, 12, 15, 26, 38};
		int[] array2 = {2, 13, 17, 30, 45};

		
		int median_pos = ((array1.length+array2.length)/2)-1;
		//System.out.println(median_pos);
		int i=0;
		int j=0;
		int count=0;
		for(;i<array1.length && j<array2.length && count != median_pos;){
			if(array1[i] > array2[j]){
				j++;
				count++;
			}
			else if(array2[j]>array1[i])
			{
				i++;
				count++;
			}
				
		}
		//System.out.println("i is: "+i+" and j is: "+j+" and count is: "+count);
		System.out.println("The median is: "+((array1[i]+array2[j])/2));


	}
}