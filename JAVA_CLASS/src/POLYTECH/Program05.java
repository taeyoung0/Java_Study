package POLYTECH;


class Account{
	
	String id;
	int result;
	String name;
	
	Account(){
		
	}
	
	Account(String id, int result, String name){
		this.id = id;
		this.result = result;
		this.name = name;
	}
	
	void income(int money) {
		result += money;
		System.out.println(name+"님의 계좌에 "+ money+ "원이 입금되었습니다.");
		status();
	}
	
	void outcome(int money) {
		result -= money;
		System.out.println(name+"님의 계좌에서 "+money +"원이 출금되었습니다.");
		status();
	}
	
	void status() {
		System.out.println(name+"님의 계좌 잔액은 "+result+"원 입니다.");
	}
}
	
public class Program05 {
	
	public static void main(String[] args) {
		Account me = new Account("22155-4556465",500000000,"전태영");
		Account you = new Account("56465-445414",10000,"박진병");
		
		me.income(1000000);
		me.outcome(500000);
		
		you.income(1000000);
		you.outcome(1500000);

	}
}
