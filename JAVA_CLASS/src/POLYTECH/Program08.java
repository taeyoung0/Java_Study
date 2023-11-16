package POLYTECH;

abstract class Animal
{
	abstract void cry();
}

class Dog extends Animal
{
	void cry()
	{
		System.out.println("멍멍");
	}
}

class Cat extends Animal
{
	void cry()
	{
		System.out.println("야옹");
	}
}

public class Program08 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.cry();
		cat.cry();

	}

}
