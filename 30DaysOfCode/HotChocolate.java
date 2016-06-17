public class HotChocolate{
	
	public static final double tooHot = 185;
	public static final double tooCold = 160;

	public static void drinkHotChocolate(double cocoTemp) throws TooHot,TooCold{
		if(cocoTemp >= tooHot){
			throw new TooHot();
		} else if(cocoTemp <= tooCold){
			throw new TooCold();
		}
	}



	public static void main(String args[]){

		double currentTemp = 190;
		try{

			drinkHotChocolate(currentTemp);
			System.out.println("This temperature is perfect");

		}catch(TooHot e1){

			System.out.println("That's too HOT");

		}catch(TooCold e2){
			System.out.println("That's so COLD");
		}






	}
}