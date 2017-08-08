import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton{

  private static Singleton firstInstance = null;

  //make the constructor private so that this class cannot be
  //instantiated
  private Singleton(){}

  //Get the only object available
  public static Singleton getInstance(){

    if(firstInstance == null){


      firstInstance = new Singleton(); // Lazy Instantiation
                                      // If not needed never created
    }
    return firstInstance;
  }

  public void showMessage(){
    System.out.println("Hello World");
  }


}
