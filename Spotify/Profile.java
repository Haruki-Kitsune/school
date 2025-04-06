package HUD;
import java.util.Random;
import java.util.Scanner;


public class Profile
{
	private String main = "<Spotify> ";
	private String username;
	private int accNum;
	private String password;
	private boolean inlog;
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	
	/************\
	 Constructors
	\************/
	//default constructor.
	public Profile()
	{
		username = "guest";
		accNum = rand.nextInt(100000);
		password = "1234";
		inlog = false;
	}
	
	//constructor with parameters.
	public Profile(String user, String pass)
	{
		username = user;
		accNum = rand.nextInt(100000);
		password = pass;
		inlog = false;
	}
	
	
	
	/*******\
	 Methods 
	\*******/
	//Profile menu.
	public void profileMenu(String input)
	{
		switch (input)
		{
		case "info":
			info();
			break;
		case "change username":
			changeUsername();
			break;
		case "change password":
			changePassword();
		default:
			System.out.println(main + "Can not recognize your command. Please try again.");
			HUD.wait(250);
			System.out.println(main + "Tip: all commands need to be in all lowercases.");
			break;
		}
	}
	
	//Shows the info of the account.
	public void info()
	{
		//text
		HUD.wait(250);
		System.out.println(main + "Your username is      : " + username);
		HUD.wait(250);
		System.out.println(main + "Your account number is: " + accNum);
		HUD.wait(250);
		System.out.println(main + "Your password is      : " + password);
		HUD.wait(250);
		System.out.println(" ");
	}
	
	//It will change the user name.
	public void changeUsername()
	{
		//text
		HUD.wait(250);
		System.out.println(main + "How do you want to be called?");
		String newUser = scan.nextLine();
		//code
		username = newUser;
		//text
		HUD.wait(250);
		System.out.println(main + "Your username has been changed to '" + newUser + "'.");
		HUD.wait(250);
		System.out.println(main);
	}
	
	//It will change the password of the user.
	public void changePassword()
	{
		//Creates a retry loop.
		boolean done = false;
		do
		{
			//text
			HUD.wait(250);
			System.out.println(main + "Type in your old password");
			String oldPass = scan.nextLine();
			HUD.wait(250);
			System.out.println(main + "Type in your new password");
			String newPass = scan.nextLine();
			HUD.wait(250);
			System.out.println(main + "Retype your new password");
			String rePass = scan.nextLine();
			//code
			//Checks if the old password is correct.
			if (oldPass.contentEquals(password))
			{
				//Checks if the new passwords match.
				if (rePass.contentEquals(newPass))
				{
					//code
					password = newPass;
					//text
					HUD.wait(250);
					System.out.println(main + "Your new password is now '" + newPass + "'.");
					HUD.wait(250);
					System.out.println(main);
					//code
					done = true;
				}
				else
				{
					//text
					HUD.wait(250);
					System.out.println(main + "Passwords did not match. Please try again.");
				}
			}
			else
			{
				//text
				HUD.wait(250);
				System.out.println(main + "You used the wrong password. Please try again.");
			}
		}
		while (!done);
	}
	public String toString()
	{
		return("" + getUsername() + "\t" + getPassword());
	}
	
	
	
	/**************************************************\
	 This code is all getters and setters for the vars.
	\**************************************************/
	//code
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String user)
	{
		this.username = user;
	}
	public int getAccNum()
	{
		return accNum;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String pass)
	{
		this.password = pass;
	}
	public boolean getInlog()
	{
		return inlog;
	}
	public void setInlog(boolean login)
	{
		this.inlog = login;
	}
}
