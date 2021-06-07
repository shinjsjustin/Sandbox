public class Card {
    private int value;
    private Suit suit;

    public Card(){
        new Card(-1,Suit.Spade);
    }

    public Card(int value){
        new Card(value, Suit.Spade);
    }

    public Card(int value, Suit suit){
        this.value = value;
        this.suit = suit;
    }


}

enum Suit{
    Spade,Diamond,Heart,Club
}
