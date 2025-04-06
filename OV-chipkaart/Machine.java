package Program;
import java.util.Scanner;

public class Machine 
{
	public void charge(Chipkaart kaart)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("--**Hoeveel euro wil je erop zetten?**--");
		double erbij = in.nextDouble();
		//geld erbij doen.
		kaart.changeSaldo(erbij);
		System.out.println("--**Er is" + erbij + "euro bij gezet, nu staat er '" + kaart.getSaldo() + "' euro op**--");
	}
	
	//geeft info over de kaart
	public void info(Chipkaart kaart)
	{
		System.out.println("--**Dit is de kaart van: " + kaart.getName() + "**--");
		System.out.println("--**Het kaartnummer is: " + kaart.getNumber() + "**--");
		System.out.println("--**Uw huidige saldo is: " + kaart.getSaldo() + "**--");
	}
}
