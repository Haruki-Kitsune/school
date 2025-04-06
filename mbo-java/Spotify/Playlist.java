package HUD;
import java.util.Random;
import java.util.Scanner;

public class Playlist
{	
	private String main = "<Spotify> ";
	private int length;
	Song[] list = new Song[100];
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	/***********\
	 Constructor
	\***********/
	public Playlist()
	{
		length = 9;
	}
	
	
	/*******\
	 Methods 
	\*******/
	public void firstFill()
	{
		list[0] = new Song("viva la vida", "coldplay");
		list[1] = new Song("don't stop me now", "queen");
		list[2] = new Song("50 ways to say goodbye", "train");
		list[3] = new Song("ichiban no takaramono", "lisa");
		list[4] = new Song("stella-rium", "kano");
		list[5] = new Song("highway to oblivion", "dragonforce");
		list[6] = new Song("impulse", "alia");
		list[7] = new Song("staple stable", "Chiwa Saito");
		list[8] = new Song("inferno", "mrs. greenapple");
		list[9] = new Song("sex on fire", "kings of leon");
	}
	
	public void playlistMenu(String input)
	{
		switch (input)
		{
		case "play":
			playSong();
			break;
		case "add song":
			addSong();
			break;
		case "shuffle":
			shuffle();
			break;
		case "show list":
			showList();
			break;
		case "remove song":
			removeSong();
		case "like":
			likeSong();
			break;
		default:
			HUD.wait(250);
			System.out.println(main + "Can not recognize your command. Please try again.");
			HUD.wait(250);
			System.out.println(main + "Tip: all commands need to be in all lowercases.");
			break;
		}
	}
	
	//Plays a song
	public void playSong()
	{
		int play = 0;
		//text
		HUD.wait(250);
		System.out.println(main + " ");
		System.out.println(main + "Now playing: " + list[play].getSong() + " form " + list[play].getArtist());
		System.out.println(main + " ");
		//code
		//asks you if you want to continue the playlist.
		for (int i = 0 ; i <= length ; i++)
		{
			//if the you are at the end of the playlist it will say that you are at the end
			if (play >= length)
			{
				//text
				HUD.wait(250);
				System.out.println(main + "This is the end of the playlist.");
			}
			else
			{
				play++;
				//text
				System.out.println(main + "Do you want to continue? yes/no");
				String choose = scan.nextLine();
				//code
				switch (choose)
				{
				//if yes it plays the next one.
				case "yes":
					System.out.println(main + " ");
					System.out.println(main + "Now playing: " + list[play].getSong() + " form " + list[play].getArtist());
					System.out.println(main + " ");
					break;
				//if no it will stop playing.
				case "no":
					System.out.println("come back when you feel like listening music again.");
					i = length + 1;
					break;
				}
			}
		}	
	}
	
	//You can add songs
	public void addSong()
	{
		HUD.wait(250);
		length++;
		System.out.println(main + "This method is out of order");
		System.out.println("song");
		String newSong = scan.nextLine();
		System.out.println("artist");
		String newArtist = scan.nextLine();
		list[length] = new Song(newSong, newArtist);
	}
	
	//Removes a song from the list
	public void removeSong()
	{	
		Song[] temp = new Song[1];
		//text
		HUD.wait(250);
		System.out.println(main + "Please type in the number of the song you want to remove.");
		int del = scan.nextInt();
		//code
		temp[0] = list[del];
		//moves the list entries one back to fill the gap
		for (int i = del ; i <= length ; i++)
		{
			list[i] = list[i + 1];
		}
		length--;
	}
	
	//Will shuffle the playlist
	public void shuffle()
	{
		for (int i = 0 ; i < 50 ; i++)
		{
			int shuffle1 = rand.nextInt(length);
			int shuffle2 = rand.nextInt(length);
			Song[] temp = new Song[1];
			temp[0] = list[shuffle1];
			list[shuffle1] = list[shuffle2];
			list[shuffle2] = temp[0];
		}
		HUD.wait(250);
		System.out.println(main + "Playlist has been shuffled.");
	}
	
	//Will like a song
	public void likeSong()
	{
		//text
		HUD.wait(250);
		System.out.println(main + "Type in the number of the song you wish to like");
		int like = scan.nextInt();
		//code
		list[like].setLiked("liked");
	}
	
	//It will show the chosen list
	public void showList()
	{
		//text
		HUD.wait(250);
		System.out.println(main + "User's playlist");
		//code
		for (int i = 0 ; i <= length ; i++)
		{
			System.out.println(i + ":");
			System.out.println(list[i]);
			System.out.println("");
		}
	}
}
