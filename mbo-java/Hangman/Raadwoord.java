package RaadWoord;
import java.util.Scanner;

public class Raadwoord {
	
	public static void main(String[] args)
			{
				String raad = "lolicon";
				int gewonnen = 0;
				Scanner Input = new Scanner(System.in);
				while (gewonnen == 0)
				{
					System.out.println("What is the mystery word");
					String woord = Input.nextLine();
					if (woord.equals(raad))
						{
							gewonnen = gewonnen +1;
							System.out.println("gewonnen");
						}
				}
			}

}
