public class Ace extends Card{

    public Ace(){ super(); }

    public Ace(Suit s){ super(s,1,'A'); }

    public int value() {
        return 1;
    }

}
