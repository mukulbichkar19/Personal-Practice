public class Dog extends Animal{

  public void digHole(){
    System.out.println(this.getName() + " digs hole");
  }

  public Dog(){
    super();
    setSound("Bark");
  }

  public void changeVar(int num){
    num = 12;
    System.out.println("Number inside the method: "+num);
  }



}
