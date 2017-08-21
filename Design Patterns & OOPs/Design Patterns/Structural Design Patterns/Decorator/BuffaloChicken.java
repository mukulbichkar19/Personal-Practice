public class BuffaloChicken extends ToppingDecorator{

  private String description = "Buffalo Chicken";
  private double cost = 2.00;

  public BuffaloChicken(Pizza newPizza){
    super(newPizza);
    System.out.println("Adding "+description);
  }

  public String getDescription() {
    return tempPizza.getDescription() + " , " + description;
  }

  public double getCost() {
    return tempPizza.getCost() + cost;
  }




}
