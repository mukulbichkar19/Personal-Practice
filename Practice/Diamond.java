public class Diamond extends Abs{

  // public void foo(){
  //   System.out.println("In Class Implementation");
  // }

  

  public void area(){
    System.out.println("Overriden method from abstract class");
  }


  public static void main(String args[]){
      Diamond d = new Diamond();
      d.area();
      d.greet();

      // d.foo();
      // System.out.println(d.a + " :: " + d.aa + " :: "+d.b+" :: "+d.bb);
  }
}
