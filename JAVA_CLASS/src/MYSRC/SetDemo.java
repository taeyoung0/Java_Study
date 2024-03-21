package MYSRC;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		Collection <Integer> A = new ArrayList<Integer>();   // 해쉬 셋 이나 어레이리스트도 컬렉션 인터페이스를 구현하기 때문에 오류x
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(3);
		A.add(3);
		A.add(3);
		A.add(3);
		
		Iterator hi = A.iterator();
		while (hi.hasNext())
		{
			System.out.println(hi.next());
		}
	}

}
