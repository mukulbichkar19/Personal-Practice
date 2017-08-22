// Concrete Visitor Class
public class TaxVisitor implements Visitor{

  // This is created so that each item is sent to the
  // right version of visit() which is required by the
  // Visitor interface and defined below

  public TaxVisitor(){

  }

  public double visit(Liquor liquorItem){
    System.out.println("Liquor Item Found");
    return (liquorItem.getPrice() * 1.15) + liquorItem.getPrice();
  }

  public double visit(Tobacco tobaccoItem){
    System.out.println("Tobacco Item Found");
    return (tobaccoItem.getPrice() * 1.3) + tobaccoItem.getPrice();
  }
  
  public double visit(Necessity necessityItem){
    System.out.println("Necessity Item Found");
    return (necessityItem.getPrice() * 0.15) + necessityItem.getPrice();
  }









}
