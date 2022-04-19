package Week_6_final_project;
import java.util.*;
/*
 * This class represents player data and player functionality in the card game run by app.java
 * c.	Player
	i.	Fields
		1.	hand (List of Card)
		2.	score (set to 0 in the constructor)
		3.	name
	ii.	Methods
		1.	describe (prints out information about the player and calls the describe method for each card in the Hand List)
		2.	flip (removes and returns the top card of the Hand)
		3.	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
		4.	incrementScore (adds 1 to the Player’s score field)

 * 
 */
public class Player {
	private ArrayList<Card> hand = new ArrayList<Card>();
	private String name = "";
	private int score;
	
	public Card flip() { 
		//this returns and removes the top card (index 0) from the players hand
		Card given = new Card();
		given = hand.get(0);
		hand.remove(0);
		
		return given;
	}
	public void draw(Deck deck) {
		//this draws a card from the given deck and adds it to the end of the 
		//player's hand
		hand.add(deck.drawCard());
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public void incrementScore() {
		//increments the players score by 1
		this.score+=1;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public Player(String name) {
		//constructor for player name and sets score to 0
		this.name=name;
		this.score=0;
	}

}
