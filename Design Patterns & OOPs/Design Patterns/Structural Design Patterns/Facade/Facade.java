// For a client unfamiliar with Class1, Class2, and Class3, it would be very difficult to figure out how to interact with these classes. The classes interact and perform tasks in unclear ways. As a result, we need to be able to simplify interaction with this system of classes so that clients can interact with these classes in a simple, standardized manner.

// We do this with the Facade class. The Facade class has three methods: cubeX(), cubeXTimes2(), and xToSixthPowerTimes2(). The names of these methods clearly indicate what they do, and these methods hide the interactions of Class1, Class2, and Class3 from client code.

public class Facade{

  public int cubeX(int x){
    Class1 class1 = new Class1();
    return class1.doSomething(x);
  }

  public int cubeXTimes2(int x){
    Class1 class1 = new Class1();
    Class2 class2 = new Class2();
    return class2.doAnotherThing(class1, x);
  }

  public int xToSixthPowerTimes2(int x){
    Class1 class1 = new Class1();
    Class2 class2 = new Class2();
    Class3 class3 = new Class3();
    return class3.doMoreStuff(class1, class2, x);
  }

}
