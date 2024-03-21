package POLYTECH;

public class SingleThread {

	public static void main(String[] args) {

		int sum = 0;

		try {

			for (int i = 0; i <= 100; i++) {
				sum += i;
			}
			System.out.println("1부터 100까지의 합은 : " + sum + "입니다.");

			int i = 0;

			while (true) {

				Thread.sleep(1000);

				i++;
				if (i == 10) {
					System.out.println("10초");
					break;
				} else {
					System.out.println(i + "초");
				}
			}

			char alp;

			for (alp = 'A'; alp <= 'Z'; alp++) {
				System.out.print(alp + " ");
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
