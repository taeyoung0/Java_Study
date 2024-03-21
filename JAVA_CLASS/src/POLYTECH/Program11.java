package POLYTECH;

abstract class Animal1
{
	abstract void bark();
}



class Jinbyeong extends Animal1
{
	void bark()
	{
		System.out.println("웩");
	}
}

class dogs extends Animal1
{
	
	@Override
	void bark() {
		System.out.println("멍멍");
		
	}
}
class cats extends Animal1
{
	@Override
	void bark()
	{
		System.out.println("야옹");
	}
}

public class Program11 {

	public static void main(String[] args) {
		

		
		Animal1 p[] = { new Jinbyeong(), new dogs(), new cats()};
		
		for(int i = 0; i < 3; i++)
		{
			p[i].bark();
		}
	}

}
