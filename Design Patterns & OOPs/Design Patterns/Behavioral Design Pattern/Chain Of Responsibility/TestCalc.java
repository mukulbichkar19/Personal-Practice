public class TestCalc{


  public static void main(String args[]){

    Chain chainCalc1 = new AddNumbers();
    Chain chainCalc2 = new SubtractNumbers();
    Chain chainCalc3 = new MultiplyNumbers();

    chainCalc1.setNextChain(chainCalc2);
    chainCalc2.setNextChain(chainCalc3);

    Numbers request = new Numbers(4,2,"subtract");

    chainCalc1.calculate(request);



  }


}
