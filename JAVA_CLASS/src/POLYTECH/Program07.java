package POLYTECH;

class Book
{
	String name;
	static int price;
	
	void Info()
	{
		System.out.println(name+":"+price);
	}
}

class Book2
{
	String name;
	int price;
	
	void Info()
	{
		System.out.println(name+":"+price);
	}
}

public class Program07 
{

	public static void main(String[] args) 
	{
		
		Book b1 = new Book();
		Book b2 = new Book();
		b1.name = "C";
		b2.name = "JAVA";
		b1.price = 10000;
		b2.price = 15000;
		
		b1.Info();
		b2.Info();
		
		Book2 bo1 = new Book2();
		Book2 bo2 = new Book2();
		bo1.name = "C";
		bo2.name = "JAVA";
		bo1.price = 10000;
		bo2.price = 15000;

		bo1.Info();
		bo2.Info();
	}
}
