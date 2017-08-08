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

    // Abstraction here you cannot acccess methods or fields from dog or cat
    Animal doggy = new Dog();
    Animal kitty = new Cat();


    Animal[] animals = new Animal[2];
    animals[0] = doggy;
    animals[1] = kitty;
    for(Animal a:animals){
      System.out.println(a.getSound());
    }


    // Abstarction
    Giraffe g = new Giraffe();
    g.setName("Frank");
    System.out.println("Giraffe's name is "+g.getName());



  }

  public static void changeObjectName(Dog obj){
    obj.setName("tommy");
  }

}
