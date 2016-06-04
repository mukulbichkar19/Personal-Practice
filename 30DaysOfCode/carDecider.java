public class carDecider{
	


	public static void main(String args[]){

		// Variable Declaration
		int carprice1, carprice2;
		int mileagecar1,mileagecar2;
		double costoffuel,milesexpected;
		double runningcostcar1, runningcostcar2;

		// User Input
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the price of car 1 and car 2: ");
		carprice1 = scan.nextInt();
		carprice2 = scan.nextInt();
		System.out.println("Enter the mileages of car 1 and car 2 respectively: ");
		mileagecar1 = scan.nextInt();
		mileagecar2 = scan.nextInt();
		System.out.println("Enter the cost of fuel per gallon: ");
		costoffuel = scan.nextDouble();
		System.out.println("Enter the miles you expect to drive: ");
		milesexpected = scan.nextDouble();

		// Actual Business Logic
		runningcostcar1 = carprice1 + ((milesexpected/mileagecar1)*costoffuel);
		runningcostcar2 = carprice2 + ((milesexpected/mileagecar2)*costoffuel);

		System.out.println(runningcostcar1);
		System.out.println(runningcostcar2);
		
		if(runningcostcar1 > runningcostcar2)
		{
			System.out.println("Buy Car 2");
		}
		else{
			System.out.println("Buy Car 1");
		}

		


	}
}