public class EnemyShipTesting{

  public static void main(String args[]){

    EnemyShip theEnemy = null;
    EnemyShipFactory  shipFactory = new EnemyShipFactory();
    java.util.Scanner scan = new java.util.Scanner(System.in);
    String enemyShipOption = "";
    System.out.println("What type of ship? (U / R / B): ");
    if(scan.hasNextLine()){
      String typeOfShip = scan.nextLine();
      theEnemy =  shipFactory.makeEnemyShip(typeOfShip);
    }

    if(theEnemy != null){
      doStuffEnemy(theEnemy);
    }




  }

  public static void doStuffEnemy(EnemyShip anEnemyShip){
    anEnemyShip.displayEnemyShip();
    anEnemyShip.followHeroShip();
    anEnemyShip.enemyShipShoots();
  }


}
