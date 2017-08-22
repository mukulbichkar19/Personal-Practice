public class AmericanSeller{

  Mediator mediator;
  double priceInDollars;


  public AmericanSeller(Mediator mediator, double priceInDollars){
    this.mediator = mediator;
    this.priceInDollars = priceInDollars;
    this.mediator.registerAmericanSeller(this);
  }

  public boolean isBidAccepted(double bidInDollars) {
		if (bidInDollars >= priceInDollars) {
			System.out.println("Seller accepts the bid of " + bidInDollars + " dollars\n");
			return true;
		} else {
			System.out.println("Seller rejects the bid of " + bidInDollars + " dollars\n");
			return false;
		}
	}



}
