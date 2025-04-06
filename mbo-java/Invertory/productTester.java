package Product;
import java.util.Scanner;

public class productTester
{
	private static int id3, id4, id5, id6;
	private static String n3, n4, n5, n6;
	private static int s3, s4, s5, s6;
	private static double c3, c4, c5, c6;
	private static int tempNumber;
	private static String tempName;
	private static int tempQty;
	private static double tempPrice;
	
	/*
	 * Note:
	 * I had problems with the scanner that forced me to make a new scanner every time I want an input.
	 */
	public static void main(String[] args)
	{
		//Constructor for the first and second product.
		System.out.println("Please enter the name");
		Scanner in = new Scanner(System.in);
		tempName = in.nextLine();
		System.out.println("Please enter the item number");
		Scanner in1 = new Scanner(System.in);
		tempNumber = in1.nextInt();
		System.out.println("Please enter the quantity");
		Scanner in2 = new Scanner(System.in);
		tempQty = in2.nextInt();
		System.out.println("Please enter the price");
		Scanner in3 = new Scanner(System.in);
		tempPrice = in3.nextInt();
		Product p1 = new Product(tempNumber, tempName, tempQty, tempPrice);
		System.out.println(p1);
		
		System.out.println("Please enter the name");
		Scanner in21 = new Scanner(System.in);
		tempName = in21.nextLine();
		System.out.println("Please enter the item number");
		Scanner in22 = new Scanner(System.in);
		tempNumber = in22.nextInt();
		System.out.println("Please enter the quantity");
		Scanner in23 = new Scanner(System.in);
		tempQty = in23.nextInt();
		System.out.println("Please enter the price");
		Scanner in24 = new Scanner(System.in);
		tempPrice = in24.nextInt();
		Product p2 = new Product(tempNumber, tempName, tempQty, tempPrice);
		System.out.println(p2);
		
		//The constructor of the rest.
		System.out.println("Please enter the item ID");
		Scanner inputI3 = new Scanner(System.in);
		id3 = inputI3.nextInt();
		System.out.println("Please enter the product name");
		Scanner inputN3 = new Scanner(System.in);
		n3 = inputN3.nextLine();
		System.out.println("Please enter the total stock");
		Scanner inputS3 = new Scanner(System.in);
		s3 = inputS3.nextInt();
		System.out.println("Please enter the price");
		Scanner inputC3 = new Scanner(System.in);
		c3 = inputC3.nextDouble();
		Product p3 = new Product(id3, n3, s3, c3);
		
		System.out.println("Please enter the item ID");
		Scanner inputI4 = new Scanner(System.in);
		id4 = inputI4.nextInt();
		System.out.println("Please enter the product name");
		Scanner inputN4 = new Scanner(System.in);
		n4 = inputN4.nextLine();
		System.out.println("Please enter the total stock");
		Scanner inputS4 = new Scanner(System.in);
		s4 = inputS4.nextInt();
		System.out.println("Please enter the price");
		Scanner inputC4 = new Scanner(System.in);
		c4 = inputC4.nextDouble();
		Product p4 = new Product(id4, n4, s4, c4);
		
		System.out.println("Please enter the item ID");
		Scanner inputI5 = new Scanner(System.in);
		id5 = inputI5.nextInt();
		System.out.println("Please enter the product name");
		Scanner inputN5 = new Scanner(System.in);
		n5 = inputN5.nextLine();
		System.out.println("Please enter the total stock");
		Scanner inputS5 = new Scanner(System.in);
		s5 = inputS5.nextInt();
		System.out.println("Please enter the price");
		Scanner inputC5 = new Scanner(System.in);
		c5 = inputC5.nextDouble();
		Product p5 = new Product(id5, n5, s5, c5);
		
		System.out.println("Please enter the item ID");
		Scanner inputI6 = new Scanner(System.in);
		id6 = inputI6.nextInt();
		System.out.println("Please enter the product name");
		Scanner inputN6 = new Scanner(System.in);
		n6 = inputN6.nextLine();
		System.out.println("Please enter the total stock");
		Scanner inputS6 = new Scanner(System.in);
		s6 = inputS6.nextInt();
		System.out.println("Please enter the price");
		Scanner inputC6 = new Scanner(System.in);
		c6 = inputC6.nextDouble();
		Product p6 = new Product(id6, n6, s6, c6);
		
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
	}

}
