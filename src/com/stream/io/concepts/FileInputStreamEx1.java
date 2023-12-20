package com.stream.io.concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx1 {

	public static void main(String[] args) throws IOException {

		try {
			File file = new File("./OutputEx1.txt");
			FileInputStream fis = new FileInputStream(file);

			int i = fis.read();
			System.out.println(i);

			int j = 0;
			while ((j = fis.read()) != -1) {
				System.out.print((char) j);
			}
			fis.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
