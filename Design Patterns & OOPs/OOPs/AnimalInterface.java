/*
  1. A class with only abstract methods
  2. You can add as many interfaces to a class using implements
  3. Can only use public static and final fields
  4. Classes from different inheritance trees can use a common interface
 */
public interface AnimalInterface{

  public void setName(String name);
  public String getName();

  public void setWeight(double weight);
  public double getWeight();

  public void setSound(String sound);
  public String getSound();






}
