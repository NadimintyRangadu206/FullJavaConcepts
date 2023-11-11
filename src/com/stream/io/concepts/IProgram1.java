package com.stream.io.concepts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IProgram1 {

	public static void main(String[] args) throws IOException {

		File file = new File("./text.txt");

		try {
			if (!file.exists()) {
				file.createNewFile();
			}

			FileInputStream fis = new FileInputStream(file);

			int j;
//			int i = fis.read();
//			System.out.println((char) i); // Single Character to read from the file

			while ((j = fis.read()) != -1) {

				char ch = (char) j;

				System.out.print(ch);

			}

			System.out.println();

			Scanner sc = new Scanner(file);

			String str = new String();

			while (sc.hasNextLine()) {
				str += sc.nextLine() + "\n";
			}
			System.out.println(str);
			System.out.println();

			FileReader fr = new FileReader(file);

			BufferedReader br = new BufferedReader(fr);

			String s = new String();
			String f;
			while ((f = br.readLine()) != null) {

				s += f + "\n";
			}
			System.out.println(s);

			fis.close();
			sc.close();

		} catch (Exception e) {
			System.out.println("throws Exception");
		}

	}

}
