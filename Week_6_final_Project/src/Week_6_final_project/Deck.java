package Week_6_final_project;
import java.util.*;
import java.util.Random;
public class Deck {
	//This class holds a list of cards, populates the list of cards with the natural 52 cards
	//method to shuffle the cards, which puts the list of cards into a new list in random
	//order and then resets the list.  It has a second method to draw the top card
	//from the current deck(index 0), removes that card from the deck, and then returns the card
//	Deck
//		i.	Fields
//			1.	cards (List of Card)
//		ii.	Methods
//			1.	shuffle (randomizes the order of the cards)
//			2.	draw (removes and returns the top card of the Cards field)
//			3.	In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.

	private ArrayList<Card> cardList = new ArrayList<Card>();


	private void populateDeck() {
		// This function uses two string arrays for suits and names, loops through suits inside a loop of names.
		//Using the iterator for each loop, the loop creates a new card with the name from the names array and 
		//suit from the suits array and calculates and passes value based on 2+ the position in the names array
		//this should only run at construction
		
		String[] names = new String[]{"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
		String[] suits = new String[]{"Diamonds", "Hearts", "Spades","Clubs"};
		for(int i = 0; i<names.length; i++) {
			for(int j = 0; j<suits.length; j++) {
				Card c = new Card(names[i]+" of "+suits[j],i+2);
				cardList.add(c);
			}
			
		}
		
	}
	public Card drawCard() {
		//returns and removes the top (position 0) card from the deck
		
		Card giveCard = new Card();
		giveCard=cardList.get(0);
		cardList.remove(0);
		
		
		return giveCard;
		
	}
	public void shuffle() {
		//creates a random order list of cards from the first card array and then replaces the original
		//with the newly created list
		ArrayList<Card> cardListNew = new ArrayList<Card>();
		int end = cardList.size();
		for(int i = 0; i<end;i++) { 
			Random rand = new Random();
			int cardPosition = rand.nextInt(cardList.size());
			cardListNew.add(cardList.get(cardPosition));
			cardList.remove(cardPosition);
	
		}
		
		cardList=cardListNew;
		
	}
	
	public Deck() {
		//constructor which calls a method to put the 52 natural cards in order into the deck.
		
		populateDeck();
		
		
	}

}
	
