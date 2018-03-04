public class Java8{




  public static void main(String args[]){

    Java8 test = new Java8();

    MathOperation add = (a,b) -> a+b;

    System.out.println(test.operation(5,3,add));

  }

}
