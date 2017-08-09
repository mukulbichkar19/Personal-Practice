// Common methods for all the enemy ships
public abstract class EnemyShip{

  private String name;
  private double amtDamage;

  public String getName() {
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public double getamtDamage() {
    return this.amtDamage;
  }

  public void setamtDamage(double amtDamage){
    this.amtDamage = amtDamage;
  }

  public void followHeroShip(){
    System.out.println(getName() + " is following the hero");
  }

  public void displayEnemyShip(){
    System.out.println(getName() + " is on the screen");
  }

  public void enemyShipShoots(){
    System.out.println(getName() + " attacks and does damage "+getamtDamage());
  }



}
