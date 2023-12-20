package com.stream.io.concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamEx1 {

	public static void main(String[] args) throws IOException, FileNotFoundException {

		File file = new File("./OutputEx2.txt");
		file.createNewFile();

		File f1 = new File("./OutputEx1.txt");
		File f2 = new File("./text.txt");
		FileInputStream file1 = new FileInputStream(f1);

		FileInputStream file2 = new FileInputStream(f2);

		SequenceInputStream sis = new SequenceInputStream(file1, file2); // Two File Combined to read the data one by
																			// one file.

		FileOutputStream fos = new FileOutputStream(file);
		int i = 0;

		while ((i = sis.read()) != -1) {
			System.out.print((char) i);
			fos.write(i); // Combined two file of data in Single file approach
		}

		fos.close();
		sis.close();
		file1.close();
		file2.close();

	}

}
