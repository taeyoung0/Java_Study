package POLYTECH;

class Calc{
	int x;
	int y;
	
	Calc(){
		x = 3;
		y = 4;
	}
	Calc(int a, int b){
		x = a;
		y = b;
		
	}
	void plus() {
		System.out.println(x+y);
	}
	
	void minus() {
		System.out.println(x-y);
	}
	
	void mutiple() {
		System.out.println(x*y);
	}
}

public class Program06 {

	public static void main(String[] args) {
		Calc a = new Calc();
		Calc b = new Calc(5,7);
		
		a.plus();
		a.minus();
		a.mutiple();
		b.plus();
		b.minus();
		b.mutiple();
		
	}

}
