public class Driver{


  public static void main(String args[]){

    ParkingLot pl = new ParkingLot("Dynasty");

    pl.createParkingSpaces();

    pl.displayPS();

    pl.initializeCustomers(10);

    pl.displayCustomers();


  }


}
