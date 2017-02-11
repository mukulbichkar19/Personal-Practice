// A Program to Calculate Histogram

public class Histogram{
	


	public static void main(String args[]){


		int[] questionsArray = {0,8,2,9,7,7,2,8,9,6,5};

		int[] histogram = new int[questionsArray.length];

		histogram[0] = -1; //Utilize this to store the maximum 

		for(int i=1;i<questionsArray.length;i++){

			histogram[questionsArray[i]]++; //Map to natural value

			if(histogram[questionsArray[i]] > histogram[0]){
				histogram[0] = i; // Store the maximum value
			}
		}


		for(int i=0;i<histogram.length;i++){
			System.out.print(histogram[i] + " ");
		}


		System.out.println("The mode is at position: "+histogram[0]+" with value: "+questionsArray[histogram[0]]);

	}
}
