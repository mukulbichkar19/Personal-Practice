public class EqualsTest{



  public static void main(String args[]){

      ObjClass obj1 = new ObjClass("Himanshu",24);
      ObjClass obj2 = new ObjClass("Ghoti",25);
      ObjClass obj3 = new ObjClass("Satyam",25);
      ObjClass obj4 = new ObjClass("Ghoti",25);

      System.out.println(obj2.equals(obj4));



  }

}
