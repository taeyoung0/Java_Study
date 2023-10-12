package POLYTECH;


public class program03 {
	public static void main(String[] args) 
	{
		int score = 80;
		
		switch(score / 10)
		{
		case 10:		
		case 9: 
		case 8: System.out.println("A");
		 	 	 break;
		case 7: 
		case 6: System.out.println("B");
		 	  	 break;
		case 5:
		case 4: System.out.println("C");
	   	 	     break;
	   	default : System.out.println("D");
		 
		}
		
		
		
		
//		int x = 10;
//				
//		if ( x >= 80)
//		{
//			System.out.println(x+"점 A 입니다.");
//		}
//		else if (x >= 60 )
//		{
//			System.out.println(x+"점 B 입니다.");
//		}
//		else if (x >= 40)
//		{
//			System.out.println(x+"점 C 입니다.");
//		}
//		else 
//			System.out.println(x+ "점 D 입니다.");
//		
//		
	}

}
