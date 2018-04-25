public class Queen extends Card{

  public Queen(){ super(); }

  public Queen(Suit s){ super(s,12,'Q'); }

  public int value() {
      return 12;
  }

}
