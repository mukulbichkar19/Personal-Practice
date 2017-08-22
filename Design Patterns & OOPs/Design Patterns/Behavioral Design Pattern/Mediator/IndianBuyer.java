public class IndianBuyer extends Buyer{

  public IndianBuyer(Mediator mediator){
    super(mediator, "Rs");
    this.mediator.registerIndianBuyer(this);
  }

}
