package POLYTECH;

class Person{
	String name;
	int age;
	int weight;
	
	void eat(){
		System.out.println(name+"님이 " +"식사하십니다.");
	}
	
	void sleep() {
		System.out.println(name+ "님이 "+"주무십니다.");
	}
	
	void medicalCheck() {
		System.out.println(name+"님의 "+ "건강검진 결과는 "+age+"세 "+ weight+"kg 입니다.");
	}
}

public class Program04 {

	public static void main(String[] args) {
		Person man1 = new Person();
		Person man2 = new Person();
		Person man3 = new Person();
		
		man1.name = "김길동";
		man1.age = 20;
		man1.weight = 62;
		
		man2.name ="이길동";
		man2.age = 30;
		man2.weight = 75;
		
		man3.name ="홍길동";
		man3.age = 40;
		man3.weight = 80;
		
		
		
		man1.eat();
		man1.sleep();
		man1.medicalCheck();
		
		man2.eat();
		man2.sleep();
		man2.medicalCheck();
		
		man3.eat();
		man3.sleep();
		man3.medicalCheck();
		
		

	}

}
