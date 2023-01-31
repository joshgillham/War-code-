public class Main 
{

    public static void main(String[] args) 
    {
        Deck.fillDeck();
        Deck.shuffle();
        displayCards();
    
    }
public static void displayCards()
{
    for (int i = 0; i < Deck.deck.size(); i++) 
    {
        System.out.println(Deck.deck.get(i).getRank() + " of " + Deck.deck.get(i).getSuit()); 
    }
}
}
