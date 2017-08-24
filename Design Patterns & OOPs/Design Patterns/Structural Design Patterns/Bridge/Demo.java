// The BridgeDemo class demonstrates our bridge pattern. We create a BigBus vehicle with a SmallEngine implementor. We call the vehicle's drive() method. Next, we change the implementor to a BigEngine and once again call drive(). After this, we create a SmallCar vehicle with a SmallEngine implementor. We call drive(). Next, we change the engine to a BigEngine and once again call drive().

public class Demo{


  public static void main(String args[]){

    Vehicle vehicle = new BigBus(new BigEngine());
    vehicle.drive();
    vehicle.setEngine(new SmallEngine());
    vehicle.drive();

    vehicle = new SmallCar(new SmallEngine());
		vehicle.drive();
		vehicle.setEngine(new BigEngine());
		vehicle.drive();



  }



}
