public class VisitorTest{
  public static void main(String args[]){

    TaxVisitor taxCalc = new TaxVisitor();

    Necessity milk = new Necessity(3.29);
    Liquor vodka = new Liquor(12);
    Tobacco cigarettes = new Tobacco(10.85);

    System.out.println(milk.accept(taxCalc) + "\n");
    System.out.println(vodka.accept(taxCalc) + "\n");
    System.out.println(cigarettes.accept(taxCalc) + "\n");

  }
}
