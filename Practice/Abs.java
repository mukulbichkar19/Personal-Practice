public abstract class Abs{


    private int myAge;

    public Abs(){
      lets();
    }

    public abstract void area();

    public void greet(){
      System.out.println("Hello From Abstract");
    }

    private void lets(){
      myAge = 25;
      System.out.println("LeetCode : "+myAge);
    }




}
