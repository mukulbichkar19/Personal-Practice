import java.util.*;


public class Solution{
	



	public static void main(String args[]){
		int i = 4;
		double d = 4.0;
		String s = "Hacker rank";

		Scanner scan = new Scanner(System.in);

		int two=0;
		double d2=0;
		String s2=null;


		System.out.println("Enter a integer, double and a String :");
		
		
			
			two = scan.nextInt();
			
			d2 = scan.nextDouble();
			scan.nextLine();
			
			s2 =scan.nextLine();
		

		System.out.println(two+" "+d2+" "+s2);
		scan.close();


	}

}