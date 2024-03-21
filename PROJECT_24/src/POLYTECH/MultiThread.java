package POLYTECH;

class Athread extends Thread {
	public void run() {
		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1부터 100까지의 합은 : " + sum + "입니다.");
	}
}

class Bthread extends Thread {
	public void run() {
		int i = 0;

		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			i++;
			if (i == 10) {
				System.out.println("10초");
				break;
			} else {
				System.out.println(i + "초");
			}
		}
	}
}

class Cthread extends Thread {
	public void run() {
		char alp;

		for (alp = 'A'; alp <= 'Z'; alp++) {
			System.out.print(alp + " ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultiThread {

	public static void main(String[] args) {
		Athread thA = new Athread();
		Bthread thB = new Bthread();
		Cthread thC = new Cthread();

		thA.start();
		thB.start();
		thC.start();

	}

}
