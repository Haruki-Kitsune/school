package Program;

public class Poortje
{
	public void checkIn(Chipkaart kaart)
	{
		//je bent ingechackt
		if (kaart.getIngecheckt())
		{
			//uitchecken
			kaart.setIngecheckt(false);
			
			//saldo 2,50 terug storten
			kaart.changeSaldo(1.50);
			
			//poortje open
			System.out.println("--**Poortje gaat open**--");
		}
		//je bent niet ingecheckt
		else
		{	
			//check saldo
			if (/*check saldo*/)
			{
				//if saldo niet toereikend dan malding en poortje niet openen
				System.out.println("--**Je hebt onvoldoende saldo**--");
				System.out.println("--**Poortje blijft dicht**--");
			}
			//else je hebt genoeg saldo
			else
			{
				//ga inchecken
				kaart.changeSaldo(-4.00);
				System.out.println("--**Er is 4 euro vanaf gehaald**--");
				System.out.println("--**Poortje gaat open**--");
			}
		}
	}
}
