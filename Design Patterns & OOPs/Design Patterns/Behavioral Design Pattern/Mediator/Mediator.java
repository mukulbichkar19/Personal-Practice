// The Mediator has references to the two buyers, the seller, and the converter. It has methods so that objects of these types can be registered. It also has a placeBid() method. This method takes a bid amount and a unit of currency as parameters. It converts this amount to a dollar amount via communication with the dollarConverter. It then asks the seller if the bid has been accepted, and it returns the answer.
public class Mediator{

 Buyer indianBuyer;
 Buyer pakistaniBuyer;
 AmericanSeller americanSeller;
 DollarConverter dollarConverter;

  public Mediator(){

  }

  public void registerIndianBuyer(IndianBuyer indianBuyer){
    this.indianBuyer = indianBuyer;
  }

  public void registerPakistaniBuyer(PakistaniBuyer pakistaniBuyer){
    this.pakistaniBuyer = pakistaniBuyer;
  }

  public void registerAmericanSeller(AmericanSeller americanSeller){
    this.americanSeller = americanSeller;
  }

  public void registerDollarConverter(DollarConverter dollarConverter){
    this.dollarConverter = dollarConverter;
  }

  public boolean placeBid(double bid, String unitOfCurrency){
    double dollarAmount = dollarConverter.convertCurrencyToDollars(bid, unitOfCurrency);
    return americanSeller.isBidAccepted(dollarAmount);
  }





}
