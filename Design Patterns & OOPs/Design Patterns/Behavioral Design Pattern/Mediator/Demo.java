public class Demo{


  public static void main(String args[]){

      Mediator mediator = new Mediator();

      Buyer indianBuyer = new IndianBuyer(mediator);
      Buyer pakistaniBuyer = new PakistaniBuyer(mediator);

      double sellingPriceInDollars = 10;

      AmericanSeller americanSeller = new AmericanSeller(mediator, sellingPriceInDollars);

      DollarConverter dollarConverter = new DollarConverter(mediator);

      double indianBidInRupees = 100;
      while (!indianBuyer.attemptToPurchase(indianBidInRupees)) {
			     indianBidInRupees+= 150;
		  }

      double pakistaniBidInRupees = 50;
      while (!pakistaniBuyer.attemptToPurchase(pakistaniBidInRupees)) {
			     pakistaniBidInRupees+= 200;
		  }

  }


}
