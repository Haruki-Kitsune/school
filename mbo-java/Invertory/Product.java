package Product;

public class Product 
{
	private int itemId;
	private String pName;
	private int stock;
	private double cost;
	private double value;
	private String active;
	
	//Instance field declarations
	public Product()
	{
		itemId = 0;
		pName = "knackerSnacker";
		stock = 0;
		cost = 0.00;
	}
	public Product(int number, String named, int qty, double price)
	{
		itemId = number;
		pName = named;
		stock = qty;
		cost = price;
		value = cost * stock;
		if (stock != 0)
		{
			active = "Active";
		}
		else
		{
			active = "Discontinued";
		}
	}

	//Returns a value.
	public int getItemId()
	{
		return itemId;
	}
	public void setItemId(int itemId)
	{
		this.itemId = itemId;
	}
	public String getPName()
	{
		return pName;
	}
	public void setPName(String pName)
	{
		this.pName = pName;
	}
	public int getStock()
	{
		return stock;
	}
	public void setStock(int stock)
	{
		this.stock = stock;
	}
	public double getPrice()
	{
		return cost;
	}
	public void setPrice(double cost)
	{
		this.cost = cost;
	}
	public double getValue()
	{
		return value;
	}
	public String getAct()
	{
		return active;
	}
	
	//converts if to a string.
	public String toString()
	{
		String p1 = "";
		p1 = "Item Number      : " + getItemId() + "\nName             : " + getPName() + "\nQuantity in stock: " + getStock() + "\nPrice            : " + getPrice() + "\nStock Value      : " + getValue() + "\nProduct Status   : " + getAct();
		return p1;
	}
}
