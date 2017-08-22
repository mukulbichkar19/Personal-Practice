public class MultiplyNumbers implements Chain{

  private Chain nextInChain;

  public void setNextChain(Chain nextChain){
    this.nextInChain = nextChain;
  }
  public void calculate(Numbers request){
    if(request.getCalculationWanted().equalsIgnoreCase("mult")){
      System.out.println(request.getNum1() + " * " + request.getNum2());
    }else{
      System.out.println("Only works for add, subtract and multiply");
    }
  }


}
