package POLYTECH;

class Human
{
	String name;
	int age;
	int weight;
	
	Human()
	{
		
	}
	void birth(String name, int age, int weight)
	{
		this.name = name;
		this.age = age;
		this.weight= weight;
	}
	
	void eat()
	{
		System.out.println("먹는다.");
		
	}
	void sleep()
	{
		System.out.println("잔다.");
	}
}

class Student extends Human
{
	void study()
	{
		System.out.println("공부한다");
	}
	void sleep()
	{
		System.out.println("도서관에서 공부하다 잔다.");
	}
}

interface Money
{
	abstract void give();
	abstract void receive();
	
}

interface Work
{
	abstract void work();
}

class Citizen extends Student implements Money, Work
{

	@Override
	public void work() {
		System.out.println("일한다.");
		
	}

	@Override
	public void give() {
		System.out.println("돈을 쓴다.");
	}

	@Override
	public void receive() {
		System.out.println("돈을 번다.");
		
	}
	void sleep()
	{
		System.out.println("일하다 지쳐 잠든다.");
	}
	
}

public class program09 {

	public static void main(String[] args) {
		Human p1 = new Human();
		Student s1 = new Student();
		Citizen c1 = new Citizen();
		
		p1.sleep();
		s1.sleep();
		c1.sleep();

		
		Human p[] = { new Human(), new Student(),new Citizen()};
		
		for (int i = 0; i < 3; i++)
			p[i].sleep();
		
	}

}
