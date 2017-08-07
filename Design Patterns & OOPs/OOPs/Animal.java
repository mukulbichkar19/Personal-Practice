public class Animal{

  private String name;
  private double height;
  private double weight;
  private String favoriteFood;
  private double speed;
  private String sound;

  // Encapsulation setters
  public void setName(String name){
    this.name = name;
  }

  public void setWeight(double weight){
    if(this.weight > 0){
      this.weight = weight;
    }else{
      System.out.println("Weight should be greater than 0");
    }
  }


  // Getters
  public String getName(){
    return this.name;
  }

  public void eat(){

  }

  public void move(int speed){
    this.speed = speed;
  }

  public void setSound(String sound){
    this.sound = sound;
  }

}
