package HUD;
import java.util.Scanner;

public class HUD
{
	/******\
	 Wait()
	\******/
	//it will pause the program for the total amount of milliseconds given.
	public static void wait(int ms)
	{
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
	
	
	
	public static void main(String[] args)
	{
		String main = "<Spotify> ";
		boolean active = true;
		int user = 0;
		String ans = "";
		int length = 3;
		int breakPoint = 1;
		Profile[] account = new Profile[length];
		Playlist list = new Playlist();
		list.firstFill();
		account[0] = new Profile();
		account[1] = new Profile("BreakPoint", "Error Evasion");
		Scanner scan = new Scanner(System.in);
		
		do
		{
			/****************\
	 	 	 Login system 2.0
			\****************/
			//text
			System.out.println(main + "Welcome to Spotify.");
			System.out.println(main + "You are not yet logged in. Please log in.");
			wait(250);
			//code
			do
			{
				//text
				for (int i = 0 ; i < 3 ; i++)
				{
					System.out.println(main + "...");
					wait(250);
				}
				
				System.out.println(main + "--------------------------");
				wait(250);
				System.out.println(main + "What would you like to do?");
				wait(250);
				System.out.println(main);
				wait(250);
				System.out.println(main + "Login");
				wait(250);
				System.out.println(main + "Register");
				wait(250);
				System.out.println(main + "--------------------------");
				String choose = scan.nextLine();
				
				//code
				switch (choose)
				{
				case "login":
					int i = 0;
					int wrong = 0;
					
					//Asks for the user name and password.
					//text
					wait(250);
					System.out.println(main + "What is your username?");
					String username = scan.nextLine();
					wait(250);
					System.out.println(main + "What is your password?");
					String password = scan.nextLine();
					
					//code
					//Checks if the user name and password are correct.
					for (i = 0 ; i < breakPoint ; i++)
					{
						if (account[i].getUsername().contentEquals(username) && account[i].getPassword().contentEquals(password))
						{
							//code
							//Sets the login of the current user to true and stops the loop.
							account[user].setInlog(true);
							i = account.length + 1;
							//text
							wait(250);
							System.out.println(main + "You are now logged in. Please enjoy your time listening.");
						}
						else
						{
							wrong++;
							//If the user name and password do not match it will go to the next in the list.
							if (wrong <= breakPoint)
							{
								user++;
								//If the list ended without a correct user name and password it will say they are incorrect and resets the list.
								if (user == breakPoint)
								{
									System.out.println(main + "Username or password are incorrect. Please try again.");
									user = 0;
								}
							}
						}
					}
					break;
				case "register":
					//code
					//Makes the list longer and pushes the safety Profile back by one to make room for the new account
					length = length + 1;
					account[breakPoint + 1] = account[breakPoint];
					//text
					wait(250);
					System.out.println(main + "What will be your username?");
					String newUser = scan.nextLine();
					wait(250);
					System.out.println(main + "What will be your password?");
					String newPass = scan.nextLine();
					
					//code
					//Creates a new account on the place the safety Profile stood.
					account[breakPoint] = new Profile(newUser, newPass);
					breakPoint++;
					//text
					wait(250);
					System.out.println(main + "User created. you can now log in.");
					wait(250);
					break;
				default:
					wait(250);
					System.out.println(main + "Can not recognize your command. Please try again.");
					wait(250);
					System.out.println(main + "Tip: all commands need to be in all lowercases.");
					break;
				}
			}
			while (!account[user].getInlog() && active);
			
			
					
			/*********\
			 Main menu 
			\*********/
			do
			{
				//text
				wait(250);
				System.out.println(main + "------------------------------------------");
				wait(250);
				System.out.println(main + "Please pick an option from the list below.");
				wait(250);
				System.out.println(main);
				wait(250);
				System.out.println(main + "Profile");
				wait(250);
				System.out.println(main + "Playlist");
				wait(250);
				System.out.println(main + "Logout");
				wait(250);
				System.out.println(main + "------------------------------------------");
				ans = scan.nextLine();
				
				//code
				switch (ans)
				{
				case "profile":
					//text
					System.out.println(main + "--------------------------------");
					wait(250);
					System.out.println(main + "What option do you like to pick?");
					wait(250);
					System.out.println(main);
					wait(250);
					System.out.println(main + "Info");
					wait(250);
					System.out.println(main + "Change username");
					wait(250);
					System.out.println(main + "Change password");
					wait(250);
					System.out.println(main + "--------------------------------");
					ans = scan.nextLine();
					//code
					account[user].profileMenu(ans);
					break;
				case "playlist":
					//text
					wait(250);
					System.out.println(main + "--------------------------------");
					wait(250);
					System.out.println(main + "What option do you like to pick?");
					wait(250);
					System.out.println(main);
					wait(250);
					System.out.println(main + "Play");
					wait(250);
					System.out.println(main + "Shuffle");
					wait(250);
					System.out.println(main + "like");
					wait(250);
					System.out.println(main + "Add song");
					wait(250);
					System.out.println(main + "Show list");
					wait(250);
					System.out.println(main + "Remove song");
					wait(250);
					System.out.println(main + "--------------------------------");
					ans = scan.nextLine();
					//code
					list.playlistMenu(ans);
					break;
				case "logout":
					//It will set the login to false to stop the loop.
					//text
					wait(250);
					System.out.println(main + "------------------");
					wait(250);
					System.out.println(main + "Do you like to do?");
					wait(250);
					System.out.println(main);
					wait(250);
					System.out.println(main + "Logout");
					wait(250);
					System.out.println(main + "quit");
					wait(250);
					System.out.println(main + "------------------");
					ans = scan.nextLine();
					
					//code
					//It will set the login to false to stop the loop.
					if (ans.contentEquals("logout"))
					{
						account[user].setInlog(false);
						wait(1000);
					}
					
					//It will set both login and active to false to stop the program.
					if (ans.contentEquals("quit"))
					{
						//text
						wait(250);
						System.out.println(main + "Thank you for using Spotify. We hope you come again.");
						//code
						account[user].setInlog(false);
						active = false;
					}
					break;
				default:
					wait(250);
					System.out.println(main + "Can not recognize your command. Please try again.");
					wait(250);
					System.out.println(main + "Tip: all commands need to be in all lowercases.");
					break;
				}
			}
			while (account[user].getInlog() && active);
		}
		while (active);
	}
}
