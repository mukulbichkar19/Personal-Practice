//BigBus is a subclass of Vehicle. It has a weight of 3000 kg. Its drive() method displays a message, calls the engine's go() method, and then calls reportOnSpeed() with the horsepower of the engine to report on how fast the vehicle is moving.
public class BigBus extends Vehicle{


  public BigBus(Engine engine){
    this.weightInKilos = 3000;
    this.engine = engine;
  }

  public void drive(){
    System.out.println("\nThe big bus is driving");
    int horsepower = engine.go();
    reportOnSpeed(horsepower);
  }



}
