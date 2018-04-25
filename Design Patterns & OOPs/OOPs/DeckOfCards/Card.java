abstract class Card{

  protected int value;
  protected Suit suit;
  protected char specialSymbol;
  private boolean isAvailable;

  public Card(){}

  public Card(Suit suit, int value, char specialSymbol){
    this.suit = suit;
    this.value = value;
    this.isAvailable = true;
    this.specialSymbol = specialSymbol;
  }


  public abstract int value();

  public Suit getSuit(){ return this.suit; }
  public char getSpecialSymbol(){ return this.specialSymbol; }
  public boolean isAvailable(){ return this.isAvailable; }
  public void markUnavailable(){ this.isAvailable = false; }
  public void markAvailable(){ this.isAvailable = true; }
}
