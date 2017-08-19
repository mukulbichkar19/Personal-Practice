//First, we have an adaptee class named CelciusReporter. It stores a temperature value in Celcius.
public class celsiusReporter{
  double tempInC;

  public celsiusReporter(){

  }

  // Getters
  public double getTemperature(){
    return this.tempInC;
  }

  // Setters
  public void setTemperature(double tempInC){
    this.tempInC = tempInC;
  }


}
