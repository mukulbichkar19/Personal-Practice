public enum Suit{
  Club(0), Spade(1), Heart(2), Diamond(3);
  private int value;
  private Suit(int v){ this.value = v; }
  private int getValue(){ return value; }
  protected static Suit getSuitFromValue(int value) {
    Suit s = Club;
    switch(value){
      case 0: s = Club;
              break;
      case 1: s = Spade;
              break;
      case 2: s = Heart;
              break;
      case 3: s = Diamond;
              break;
    }
    return s;
  }
}
