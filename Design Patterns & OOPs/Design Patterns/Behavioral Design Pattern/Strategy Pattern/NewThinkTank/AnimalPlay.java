public class AnimalPlay{



  public static void main(String args[]){
    Animal smarty = new Dog();
    Animal tweety = new Bird();
    System.out.println("Dog: "+smarty.tryToFly());
    System.out.println("Bird: "+tweety.tryToFly());
    smarty.setFlyingAbility(new ItFlys());
    System.out.println("Dog suddenly starts "+smarty.tryToFly());

  }

}
