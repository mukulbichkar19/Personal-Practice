public class SmallEngine implements Engine{

  int horsepower;

  public SmallEngine(){
    horsepower = 50;
  }

  public int go(){
    System.out.println("The small engine is running");
		return horsepower;
  }



}
