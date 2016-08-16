public class Searching{
	

	static int findTrailingzeroes(int n){


		int count = 0;

		for(int i=5;n/i >= 1;i*=5){
			count += n/i;
		}

		return count;


	}



	public static void main(String args[]){


		int n = 28;
		System.out.println("The number of trailing zeroes "+findTrailingzeroes(n));


	}


}