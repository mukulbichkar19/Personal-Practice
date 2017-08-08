public class SinglePatterDriver{



  public static void main(String args[]){
    // Cannot use the below Instantiation
    //Singleton s1 = new Singleton();

    //Get the only object available
    Singleton s = Singleton.getInstance();

    // Display the message
    s.showMessage();


  }


}
