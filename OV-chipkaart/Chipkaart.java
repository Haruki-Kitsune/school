package Program;

public class Chipkaart 
{
	private String name;
	private int kaartnummer;
	private double saldo;
	private boolean ingechecked;
	
	public Chipkaart()
	{
		name = "Onbekend";
		kaartnummer = 1;
		saldo = 10.00;
		ingechecked = false;
	}
	
	//getter voor name
	public String getName()
	{
		return name;
	}
	
	//setter voor name
	public void setName(String name)
	{
		this.name = name;
	}
	
	//getter voor kaartnummer
	public int getNumber()
	{
		return kaartnummer;
	}
	
	//setter voor kaartnummer
	public void setNumber(int number)
	{
		this.kaartnummer = number;
	}
	
	// Getter voor saldo
	public double getSaldo() 
	{
		return saldo;
	}

	// Setter voor saldo
	public void setSaldo(double saldo)
	{
		this.saldo = saldo;
	}
	  
	//om geld op de var te zetten
	public void changeSaldo(double bedrag)
	{
		this.saldo += bedrag;
	}
	  
	//setter voor ingechecked
	public void setIngecheckt(boolean ingechecked)
	{
		this.ingechecked = ingechecked;
	}
	  
	//getter voor ingechecked
	public boolean getIngecheckt()
	{
		return ingechecked;
	}
}
