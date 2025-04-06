package Main;
import java.util.Random;


public class Deck
{ 
 	static Card[] cardArray = new Card[52];
 	Deck()
 	{ //constructor 
 	 	  int suits = 4;
 	 	  int cardType = 13;
 	 	  int cardCount = 0; 
 	      for(int i = 1; i <= suits; i++)
 	    	  for(int j = 1; j <= cardType; j++)
 	    	  { 
 	    		  cardArray[cardCount] = new Card(i,j);
 	    		  cardCount++; 
 	    	  } 
 	} 
 	
 	//shuffles the deck.
 	public void shuffle()
 	{
 		Card[] temp = new Card[1];
 		Random rand = new Random();
 		for (int y = 0 ; y < 100 ; y++)
 		{
 			int i = rand.nextInt(52); 
 			int j = rand.nextInt(52);
 			temp[0] = cardArray[i];
 			cardArray[i] = cardArray[j];
 			cardArray[j] = temp[0];
 		}
 	}
 	
 	//displays the deck.
 	public void print()
 	{ 
 		for(int i = 0; i < cardArray.length; i++) 
 			System.out.println(cardArray[i]);  
 	} 

}
