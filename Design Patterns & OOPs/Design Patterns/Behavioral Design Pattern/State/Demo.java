public class Demo{

  public static void main(String args[]){

    Person person = new Person(new HappyState());
    System.out.println("Hello in happy state: " + person.sayHello());
		System.out.println("Goodbye in happy state: " + person.sayGoodBye());

    // Person turns Sad
    person = new Person(new SadState());
    System.out.println("Hello in sad state: " + person.sayHello());
		System.out.println("Goodbye in sad state: " + person.sayGoodBye());



  }


}
