package POLYTECH;

import java.io.*;

public class Project02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("test.txt");
			fw.write("My file....");
			fw.close();
		} catch (IOException e) {
			System.out.println(e);
		}

		int i;
		char c;

		try {
			FileReader fr = new FileReader("test.txt");
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
