package Main;

public class Main 
{
	public static void main(String[] args)
	{
		/*Array opdrachten
		// tabel aanmaken
		int[] tabel = new int[10];
		for (int i=0 ; i<10 ; i++)
			tabel[i] = i + 10;
		
		// randomise en verwissel de nummers
		for (int i=0 ; i<50 ; i++)
		{
			Random rand = new Random();
			int j = rand.nextInt(10); 
			int y = rand.nextInt(10);
			int temp = tabel[j];
			tabel[j] = tabel[y];
			tabel[y] = temp;
		}
		
		// show tabel 
		for (int i=0 ; i<10 ; i++)
			System.out.print(tabel[i] + " ");
		
		int[][] tabel = new int[9][10];
		int y = 0;
		for (int i=0 ; i<9 ; i++)
			for (int j=0 ; j<10 ; j++)
			{
				tabel[i][j] = y + 10;
				y++;
			}
		
		for (int i=0 ; i<9 ; i++)
		{
			for (int j=0 ; j<10 ; j++)
			{
			System.out.print(tabel[i][j] + " ");
			}
		System.out.println();
		}
		
		int sum=0;
		for (int i=0 ; i<tabel[3].length ; i++)
		{
			sum = sum + tabel[3][i];
		}
		//int sum = IntStream.of(tabel[3]).sum();
		int avr = sum / tabel[3].length;
		
		System.out.println("The a verage is " + avr);
		*/
		
		
		
		
		
		
		
		/*
		String[] array;
		array = new String[]
				{
					"hi",
					"bye",
					"miku",
					"tachibana",
					"mofu mofu"
				};
		for (int i=0 ; i<array.length ; i++)
		{
			System.out.println(i + ": " + array[i]);
		}
		*/
		
		
		
		/*
		int[] getal = new int[50];
		for (int i=0 ; i<50 ; i++)
		{
			getal[i] = i * 2;
		}
		for (int i=0 ; i<50 ; i++)
		{
			System.out.println(i + ": " + getal[i]);
		}
		*/
		
		
		
		/*
		int[][] num = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i=0 ; i<3 ; i++)
		{
			for (int j=0 ; j<3 ; j++)
			{
				System.out.print(num[i][j]);
			}
			System.out.println();
		}
		*/
		
		
		/*
		int[] test;
		test = new int[] {10,34,90,89,50};
		test[5] = test[0] + test[1] + test[2] + test[3] + test[4];
		test[6] = test[5] / 5;
		System.out.print(test[6]);
		*/
		
		
		Deck d = new Deck();
		Hand h = new Hand();
		d.shuffle();
		h.draw(); 
		//d.print();
	}
}
