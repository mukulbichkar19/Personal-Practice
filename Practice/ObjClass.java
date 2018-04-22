public class ObjClass{

  String name;
  int age;

  public ObjClass(){}

  public ObjClass(String name, int age){
    this.name = name;
    this.age = age;
  }

  public boolean equals(ObjClass o){

      if(!(o instanceof ObjClass)){
        return false;
      }

      ObjClass other = (ObjClass) o;

      return this.name.equals(other.name) &&
             this.age == other.age;


  }


}
