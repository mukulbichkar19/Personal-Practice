public interface Flys{

  String fly();


}

class ItFlys implements Flys{
  public String fly(){
    return "Flying High";
  }
}


class CannotFlys implements Flys{
  public String fly(){
    return "I cannot fly";
  }
}
