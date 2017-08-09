public class Dog implements Animal{

  public Dog(){
    System.out.println("inside dog constructor");
  }

  public Animal makeCopy(){
    Dog dogObject = null;

    try{
      dogObject = (Dog)super.clone();
    }catch(CloneNotSupportedException e){
      e.printStackTrace();
    }
    return dogObject;
  }

  public String toString(){
    return "Dog barks boo";
  }


}
