// used for decision making and to move the unecessary details in the driver function used for abstraction
public class EnemyShipFactory{

  public EnemyShip makeEnemyShip(String shipType){
    EnemyShip newShip = null;
    switch(shipType){
      case "U" : newShip = new UFOEnemyShip();
                 break;
      case "R" : newShip = new RocketEnemyShip();
                 break;
      case "B" : newShip = new BigUFOEnemyShip();
                 break;
      default: System.out.println("Wrong Choice of ship. Choose either of U/R/B");
    }
    return newShip;
  }



}
