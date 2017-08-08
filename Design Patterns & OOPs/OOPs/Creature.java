// Cannot create object from abstract class
abstract public class Creature{

  // protected fields are like private fields except that subclasses can inherit them
  protected String name;
  protected double weight;
  protected String sound;

  public abstract void setName(String name);
  public abstract String getName();

  public abstract void setWeight(double weight);
  public abstract double getWeight();




}
