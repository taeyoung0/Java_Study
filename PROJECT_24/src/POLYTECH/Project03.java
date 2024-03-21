package POLYTECH;

import java.io.*;

public class Project03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("test.csv");
			fw.write("1,2,3,4,5\n");
			fw.write("6,7,8,9,10\n");
			fw.close();
		} catch (IOException e) {
			System.out.println(e);
		}

		int i;
		char c;

		try {
			FileReader fr = new FileReader("test.csv");
			while ((i = fr.read()) != -1) {
				c = (char) i;
				System.out.print(c);
			}
			fr.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
