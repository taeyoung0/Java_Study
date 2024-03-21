package POLYTECH;

public class Program02 {
	public static void main(String[] args)
	{
		for(int x =1; x <= 9; ++x)
		{
			for(int y = 1; y <= 9; ++y)
			{
				System.out.print(y+"*"+x+"="+(x*y)+"\t");
			}
			System.out.println(" ");
		}
	}
}
