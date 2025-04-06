package Program;
import java.util.Scanner;

public class Program 
{

	public static void main(String[] args)
	{
		Chipkaart kaart = new Chipkaart();
		Poortje poortje = new Poortje();
		Machine automaat = new Machine();
		Scanner scan = new Scanner(System.in);
		
		String keuze = "";
		
		do
		{
			System.out.println("--**Kies 'opladen' om saldo op uw chipkaart te zetten**--");
			System.out.println("--**Kies 'poort' om in of uit te checken**--");
			System.out.println("--**Kies 'i' om informatie te krijgen over uw chipkaart**--");
			System.out.println("--**Kies 'stop' om te stoppen**--");
			
			keuze = scan.nextLine();
			
			if (keuze.equals("opladen")) automaat.charge(kaart);
			if (keuze.equals("poort")) poortje.checkIn(kaart);
			if (keuze.equals("i")) automaat.info(kaart);
		}
		while (!keuze.equals("stop"));
		System.out.println("--**Gestopt**--");
	}

}
