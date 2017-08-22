public class DollarConverter{

  Mediator mediator;

  public static final double DOLLAR_PRICE = 1;
  public static final double INR_PRICE = 63.09;
  public static final double PKR_PRICE = 105.60;

  public DollarConverter(Mediator mediator){
    this.mediator = mediator;
    mediator.registerDollarConverter(this);
  }

  private double convertINRToDollars(double inr){
    double dollars = inr * (DOLLAR_PRICE / INR_PRICE);
    System.out.println("Converting " + inr + " indian rupees to " + dollars + " dollars");
    return dollars;
  }


  private double convertPKRToDollars(double pkr){
    double dollars = pkr * (DOLLAR_PRICE / PKR_PRICE);
    System.out.println("Converting " + pkr + " pakistani rupees to " + dollars + " dollars");
    return dollars;
  }

  public double convertCurrencyToDollars(double amount, String unitOfCurrency) {

    if ("Rs".equalsIgnoreCase(unitOfCurrency)) {
			return convertINRToDollars(amount);
		} else {
			return convertPKRToDollars(amount);
		}
	}






}
