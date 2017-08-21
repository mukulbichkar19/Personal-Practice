public class PlainPizza implements Pizza{


  public PlainPizza(){
    System.out.println("Plain Pizza");
  }

  public String getDescription() {
    return "Plain Pizza";
  }

  public double getCost() {
    return 2.0;
  }
}
