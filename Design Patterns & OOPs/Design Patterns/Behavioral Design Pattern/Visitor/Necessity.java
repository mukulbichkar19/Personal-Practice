public class Necessity implements Visitable{

  private double price;

  Necessity(double price){
    this.price = price;
  }

  public double getPrice(){
    return price;
  }

  public double accept(Visitor visitor){
    return visitor.visit(this);
  }




}
