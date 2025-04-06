package HUD;

public class Song
{
	private String song;
	private String artist;
	private String liked;
	/************\
	 Constructor
	\************/
	public Song(String songs, String art)
	{
		song = songs;
		artist = art;
		liked = "not liked";
	}
	
	
	
	/*******\
	 Methods 
	\*******/
	public String toString()
	{
		return("Name song: " + getSong() + "\nName artist: " + getArtist() + "\nLiked: " + getLiked());
	}
	
	
	
	/**************************************************\
	 This code is all getters and setters for the vars.
	\**************************************************/
	public String getSong()
	{
		return song;
	}
	
	public void setSong(String song)
	{
		this.song = song;
	}
	
	public String getArtist()
	{
		return artist;
	}
	public void setArtist(String artist)
	{
		this.artist = artist;
	}
	public String getLiked()
	{
		return liked;
	}
	public void setLiked(String liked)
	{
		this.liked = liked;
	}
}
