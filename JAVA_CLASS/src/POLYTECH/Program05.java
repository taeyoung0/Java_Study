package POLYTECH;

// 예금계좌 클래스
class Account{
	
	String id;
	int result;
	String name;
	
	Account(){}
	
	Account(String id, int result, String name){
		this.id = id;
		this.result = result;
		this.name = name;
	}
	
	void income(int money) //입금
	{
		result += money;
		System.out.println(name+"님의 계좌에 "+ money+ "원이 입금되었습니다.");
		status();
	}
	
	void outcome(int money) //출금
	{
		result -= money;
		if(result < 0)
		{
			System.out.println(name+"님의 계좌 잔액이 부족합니다.");
			System.out.println("계좌 잔액을 확인해주세요.");
			result+=money;
		}
		else
		{
			System.out.println(name+"님의 계좌에서 "+money +"원이 출금되었습니다.");
		}
		
		status();
	}
	
	void status() //계좌 조회
	{
		System.out.println(name+"님의 계좌 잔액은 "+result+"원 입니다.");
	}
}

// 사장님이 원하시는 예금계좌 클래스 ver2
class Account2 extends Account
{
	String date;
	void info() 
	{
		System.out.println("===계좌정보===");
		System.out.println("계좌 번호: "+id);
		System.out.println("예금주: "+name);
		System.out.println("계좌 계설일자: "+date);
		System.out.println("===========");
	}
}

// 이자가 더해지는 클래스
class Account3 extends Account2
{
	double ratio=0.10;
	
	void timegone(int year,int month)
	{
		double totalyear = year+ (double)month/12; //연도로 변환
		int totalmonth =(int)totalyear*12; // 총 개월 수 계산
		result = (int)(result * (1 + (totalyear * ratio)));// 원금에 이자를 더해준거기 떄문에 1을 더해줌 그렇지않으면 2년 이라고 하면 가정하면 0.2가 될텐데 원금에 대한 이자금이 저장되어버린다.

		System.out.println(year+"년"+month+"개월 경과되어 이자율을 적용한 현재 잔액 : "+ result);
		
	}

	
	void status()
	{
		super.status();
		ratio = 0;
	}
}




public class Program05 
{
	
	public static void main(String[] args) 
	{
		Account3 man1=new Account3();
		man1.id = "12345-678910";
		man1.name = "전태영";
		man1.result = 100000000;
		man1.date = "20231109";
		
		man1.info();
		man1.timegone(1,12);
		man1.status();
		man1.outcome(200000000);
	}
}
