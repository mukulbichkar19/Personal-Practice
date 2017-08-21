public class Mozarella extends ToppingDecorator{


  private String description = "Mozarella";
  private double cost = 0.50;

  public Mozarella(Pizza newPizza){
    super(newPizza);
    System.out.println("Adding "+description);
  }

  public String getDescription() {
    return tempPizza.getDescription() + " , "+description;
  }

  public double getCost() {
    return tempPizza.getCost() + cost;
  }




}
