public class NumericCard extends Card{

  private int numvalue;
  public NumericCard(){ super(); }

  public NumericCard(Suit s, int value){
    super(s,value,'-');
    this.numvalue = value;
  }

  public int value(){
    return this.numvalue;
  }

}
