// The HappyState class is a Concrete State that implements sayHello() and sayGoodbye() of EmotionalState. These messages are cheerful (representing a happy state).

public class HappyState implements EmotionalState{

  public String sayHello(){
    return "Hello Machaa";
  }

  public String sayGoodBye(){
    return "GoodBye Machaa";
  }



}
