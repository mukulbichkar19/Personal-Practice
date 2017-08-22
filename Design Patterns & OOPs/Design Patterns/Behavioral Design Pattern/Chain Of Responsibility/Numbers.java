public class Numbers{

  private int num1;
  private int num2;

  private String calculationWanted;

  public Numbers(int num1, int num2, String calculationWanted){
    this.num1 = num1;
    this.num2 = num2;
    this.calculationWanted = calculationWanted;
  }

  public int getNum1(){ return num1; }
  public int getNum2(){ return num2; }
  public String getCalculationWanted(){ return calculationWanted; }

}
