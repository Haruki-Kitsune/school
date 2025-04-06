package Main;
import java.util.Scanner;

public class Hand
{
	//constructor
	Scanner scan = new Scanner(System.in);
	int points = 0;
	boolean wantDraw = true;
	Card[] deck = Deck.cardArray;
	
	public void draw()
	{
		//draw 2 cards
		for (int i = 0 ; i < 2 ; i++)
		System.out.println(deck[i]);
		
		/*
		 * asks if they want to draw another card
		 * if they have less than 5 cards
		 * or less than 21 points
		 */
		for (int i = 2 ; i < 5 && points < 21 && wantDraw == true; i++)
		{
			System.out.println("Want to draw another card?");
			String answer = scan.nextLine();
			switch (answer)
			{
				case "yes" :
					System.out.println(deck[i]);
					break;
				case "no" :
					System.out.println("You have 'THIS' many points");
					wantDraw = false;
					break;
			}
		}
		//Card.getPoints();
		//points[0] = points[0] + hi[i];
	}
}
