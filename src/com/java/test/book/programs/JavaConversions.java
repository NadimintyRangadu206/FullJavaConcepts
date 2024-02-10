package com.java.test.book.programs;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class JavaConversions {

	public static void main(String[] args) throws IOException {

		String str = "4333";

		int i = Integer.valueOf(str);
		System.out.println(i);

		File file = new File("./rd.txt");

		file.createNewFile();

		FileOutputStream fis = new FileOutputStream(file);

		BufferedOutputStream bos = new BufferedOutputStream(fis);

		String s = "1234567890";
		byte[] b = s.getBytes();

		bos.write(b);

		Writer w = new FileWriter(file);

		String sr = "bsdsahgasbhs sjadjjdk asdajhjdhja njsdhsjd";
		w.append("\n").write(sr);

		w.close();
		bos.close();

		FileInputStream fos = new FileInputStream(file);

		int t = fos.read();
		System.out.println(t);

		while ((t = fos.read()) != -1) {
			System.out.print((char) t);
		}

		fis.close();
	}

}
