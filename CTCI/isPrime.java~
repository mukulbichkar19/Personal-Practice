public class isPrime{

	// To find whether a given number is prime or not.
	// Time Complexity : O(sqrt(n))
	

	private static boolean checkPrime(int n){

			for(int x=2;x*x<=n;x++){

					if(n%x == 0){
							return true;
					}
			}
			return false;


	}

	public static void main(String args[])
	{
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		if(checkPrime(n)){
				System.out.println("The entered number "+n+" is not  prime.");
		}		
		else{
				System.out.println("The entered number "+n+" is prime.");
		}		


	}


}
