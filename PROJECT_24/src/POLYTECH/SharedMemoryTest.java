package POLYTECH;

import java.util.Scanner;

class SharedMemory {
	int x = 5;
	Boolean isQuit = false;

}

class PlusThread extends Thread {
	SharedMemory shmem;

	public void run() {
		while (!shmem.isQuit) {
			System.out.println("x = " + shmem.x);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			shmem.x++;
		}
	}

}

class MinusThread extends Thread {
	SharedMemory shmem;

	public void run() {
		Scanner sc = new Scanner(System.in);

		while (shmem.x != 0) {
			sc.nextLine();
			shmem.x--;

		}

		shmem.isQuit = true;

		System.out.println("현재 x가 0입니다. 당신이 이겼습니다.");
	}

}

public class SharedMemoryTest {

	public static void main(String[] args) {

		PlusThread thP = new PlusThread();
		MinusThread thM = new MinusThread();

		SharedMemory shobj = new SharedMemory();

		thP.shmem = shobj;
		thM.shmem = shobj;

		thP.start();
		thM.start();
	}

}
