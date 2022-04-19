package Week_6_final_project;
public class App {
	public static void main(String[] args) {
		/*
		 * Instantiate a Deck and two Players, call the shuffle method on the deck.
			Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
			Using a traditional for loop, iterate 26 times and call the flip method for each player.
			Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
			After the loop, compare the final score from each player. 
			Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
		 */
		Deck deck= new Deck();
		Player player1= new Player("Donny");
		Player player2= new Player("Brady");
		
		deck.shuffle();
		//populate each player's hand of 26 cards from the top of the deck
		for(int i=1; i<=52; i++) {
			if(i%2==0) player1.draw(deck); else
			player2.draw(deck);			
		}
		//for each of the 26 cards in each player's hand,
		//take the top card of each player's hand, compare them to determine winner or tie
		//increment the score of the winning player
		//The number of cards (26) could be refactored later using size of hand to provide
		// more dynamic code if the number of cards in a hand would ever not be 26
		for(int i =1; i<=26; i++) {
			Card p1 = player1.flip();
			Card p2 = player2.flip();
			int pv1 = p1.getValue();
			int pv2 = p2.getValue();
			System.out.println(player1.getName()+"'s card: "+p1.getName()+"   "+player2.getName()+ "'s card: "+p2.getName());
			if(pv1>pv2) player1.incrementScore(); 
			else if(pv2>pv1) player2.incrementScore();
			else System.out.println("Tie! No score change");
			System.out.println(player1.getName()+"'s score= "+player1.getScore()+ "   "+ player2.getName()+"'s score= "+player2.getScore());			
		}
		//Print which player won and by how much. Ties are possible.
		if(player1.getScore()>player2.getScore()) System.out.println(player1.getName()+" wins! with "+ player1.getScore());
		else if(player2.getScore()>player1.getScore())System.out.println(player2.getName()+" wins! with "+ player2.getScore());
		else System.out.println("There was a TIE! at "+player1.getScore()+" points each!");
	
	}

}
