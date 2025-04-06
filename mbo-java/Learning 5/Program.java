package Program;
import java.util.Scanner;
import java.lang.*;

public class Program
{

	public static void main(String[] args)
	{
		//opdracht 2
		
		//System.out.println("Enter X");
		//Scanner InputX = new Scanner(System.in);
		//double X = InputX.nextDouble();
		//System.out.println("Enter Y");
		//Scanner InputY = new Scanner(System.in);
		//double Y = InputY.nextDouble();
		//System.out.println("Enter *, +, /, % or -");
		//Scanner InputCh = new Scanner(System.in);
		//char SOM = InputCh.next().charAt(0);
		
		Scanner in = new Scanner(System.in);
		System.out.println("choose");
		int choose = in.nextInt();
		
		switch (choose)
		{
		case 4 :
			//opdacht 4
			double Awnser;
			System.out.println("Enter the weight of the world");
			Scanner InputW = new Scanner(System.in);
			double Weight = InputW.nextDouble();
			System.out.println("Enter Mercury, Venus, Mars, Jupiter, Saturn, Uranus or Neptune. Don't forget capital letter");
			Scanner InputWo = new Scanner(System.in);
			String World = InputWo.nextLine();
			
			switch(World)
			{
			case "Mercury" :
				Awnser = Weight * 0.38;
			case "Venus" :
				Awnser = Weight * 0.91;
			case "Mars" :
				Awnser = Weight * 0.38;
			case "Jupiter" :
				Awnser = Weight * 2.36;
			case "Saturn" :
				Awnser = Weight * 0.92;
			case "Uranus" :
				Awnser = Weight * 0.89;
			case "Neptune" :
				Awnser = Weight * 1.13;
			}
		case 6 :
			//opdracht 6
			double average;
			int daysAbsent;
			boolean exempt = false;
			
			Scanner reader = new Scanner(System.in);
			System.out.println("This program will determine if you can get out of the final exam.");
			System.out.println("Please answer the following questions.");
			
			System.out.println("What is the avarage in the class?");
			average = reader.nextDouble();
			
			System.out.println("How many class lectures have you missed?");
			daysAbsent = reader.nextInt();
			
			if (average >= 90 && daysAbsent <= 3)
			{
				exempt = true;
			}
			else if (average >= 80 && daysAbsent <= 0)
			{
				exempt = true;
			}
			
			if (exempt)
				System.out.println("Congratulations! You are exempt from the final exem.");
			else
				System.out.println("You are not exempt from the final exam.");
		case 7 :
			//opdracht 7
			System.out.println("Enter the height of the room");
			Scanner InputH = new Scanner(System.in);
			double Height = InputH.nextDouble();
			System.out.println("Enter the width of the room");
			Scanner InputWi = new Scanner(System.in);
			double Width = InputWi.nextDouble();
			System.out.println("Enter the length of the room");
			Scanner InputL = new Scanner(System.in);
			
			double Length = InputL.nextDouble();
			double HiWi, HiLe, LeWi, Opp, Over, New;
			Double FiveL, OneL;
			int FLast, OLast;
			HiWi = Height * Width;
			HiLe = Height * Length;
			LeWi = Length * Width;
			Opp = HiWi + HiLe + LeWi;
			
			FiveL = Opp / 1500;
			FLast = FiveL.intValue();
			Over = FiveL - FLast;
			New = Over * 1500;
			
			OneL = New / 300;
			OLast = OneL.intValue();
			
			System.out.println("You need " + FLast + " 5 liter cans and " + OLast + " one liters cans");
		}
	}
}
