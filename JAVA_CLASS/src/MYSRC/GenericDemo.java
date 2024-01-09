package MYSRC;

class EmployeeInfo
{
	public int rank;
	
	EmployeeInfo(int rank)
	{
		this.rank = rank;
	}
}
class Pers <T, S>
{
	public T info;
	public S id;
	
	Pers(T info, S id)
	{
		this.info = info;
		this.id = id;
	}
	public <U> void printInfo(U info)
	{
		System.out.println(info);
	}
}

public class GenericDemo {

	public static void main(String[] args) {
		Integer i = new Integer(1);
		EmployeeInfo e = new EmployeeInfo(1);
		Pers p1 = new Pers(e,i);
		p1.printInfo(e);

	}

}
