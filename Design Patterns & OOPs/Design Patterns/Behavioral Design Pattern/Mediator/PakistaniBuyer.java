public class PakistaniBuyer extends Buyer{


  public PakistaniBuyer(Mediator mediator){
    super(mediator, "Pakistani rupee");
    this.mediator.registerPakistaniBuyer(this);
  }

}
