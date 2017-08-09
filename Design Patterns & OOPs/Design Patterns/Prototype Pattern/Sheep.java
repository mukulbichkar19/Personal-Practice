public class Sheep implements Animal{


  public Sheep() {
    System.out.println("Inside sheep constructor");
  }

  public Animal makeCopy(){
    System.out.println("Sheep is being made");
    Sheep dolly = null;
    try{
      dolly = (Sheep) super.clone();
    }catch(CloneNotSupportedException e){
      e.printStackTrace();
    }

    return dolly;
  }

  public String toString(){
    return "Dolly baaaa";
  }



}
