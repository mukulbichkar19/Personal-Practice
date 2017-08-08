public class Monkey implements AnimalInterface{

  private String name;
  private double weight;
  private String sound;

  public void setName(String name){
    this.name = name;
  }

  public void setSound(String sound){
    this.sound = sound;
  }

  public void setWeight(double wight){
    this.weight = weight;
  }

  public String getName(){
    return this.name;
  }

  public double getWeight(){
    return this.weight;
  }

  public String getSound(){
    return this.sound;
  }




}
