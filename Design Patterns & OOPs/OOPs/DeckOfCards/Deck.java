import java.util.*;

public class Deck{

  private ArrayList<Card> deck;
  private int dealtIndex;

  private List<Integer> firstCards;
  private List<Integer> otherCards;

  // MAGIC CONSTANTS
  private int no_suit = 4;
  private int no_cards = 13;

  public Deck(){
    this.deck = new ArrayList<>();
    this.dealtIndex = -1;
    this.firstCards = new ArrayList<>();
    this.otherCards = new ArrayList<>();
  }

  public void initializeDeck(){
    for(int s=0;s<no_suit;s++){
      Suit selectedSuit = Suit.getSuitFromValue(s);
      Card card = null;
      for(int c=1;c<=no_cards;c++){
        switch(c){
          case 1: card = new Ace(selectedSuit);
                 break;
          case 11: card = new Jack(selectedSuit);
                  break;
          case 12: card = new Queen(selectedSuit);
                  break;
          case 13: card = new King(selectedSuit);
                  break;
          default: card = new NumericCard(selectedSuit, c);
        }
        deck.add(card);
        card = null;
      }
    }
  }


  public void displayDeck(){

    for(Card d:deck){
      System.out.print("This card belongs to ");
      System.out.print("Suit: "+d.getSuit()+" and Value: "+d.value()+" special symbol: "+d.getSpecialSymbol());
      System.out.println();
    }
  }

  public void shuffle(){

    Random rand = new Random();
    int limit = no_suit*no_cards;

    for(int i=0;i<limit;i++){

        // Method 1: More collisions
        //int next_random_no = rand.nextInt(no_suit*no_cards);

        // Method 2: Less collisions
        int next_random_no = rand.nextInt((limit-i)+1) + i;

        this.firstCards.add(i);
        this.otherCards.add(next_random_no);
        Card selectedCard = deck.remove(i);
        Card otherCard = deck.get(next_random_no);
        deck.add(next_random_no, selectedCard);
        deck.add(i, otherCard);

    }

    // Set<Integer> collisions = new HashSet<>();
    // for(Integer f:firstCards){
    //   if(otherCards.contains(f)){
    //     collisions.add(f);
    //   }
    // }
    // System.out.println("No of collisions: "+collisions.size());
  }




}
