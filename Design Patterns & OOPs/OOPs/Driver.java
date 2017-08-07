public class Driver{


  public static void main(String args[]){
    Dog roger = new Dog();
    roger.setName("Roger");
    roger.digHole();
    System.out.println("Dog's name is: "+roger.getName());
    int num = 10;
    // Pass by value example
    roger.changeVar(num);
    System.out.println("After method call value: "+num);

    // Objects are passed by reference example
    changeObjectName(roger);
    System.out.println("After method call: "+roger.getName());

  }

  public static void changeObjectName(Dog obj){
    obj.setName("tommy");
  }

}
