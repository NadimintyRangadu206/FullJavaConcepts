package com.stream.io.concepts;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class OProgram1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		File file = new File(".\\practice.txt");

		if (!file.exists()) {

			file.createNewFile();
		}

		FileOutputStream fos = new FileOutputStream(file);

		BufferedOutputStream bos = new BufferedOutputStream(fos);

		String firstName = "Nadiminty";
		byte[] b = firstName.getBytes();

		bos.write(b);

		bos.close();
		fos.close();

		FileInputStream fis = new FileInputStream(file);

		BufferedInputStream bis = new BufferedInputStream(fis);

		int i;
		while ((i = bis.read()) != -1) {

			System.out.print((char) i + "\t");
		}

		fis.close();
		bis.close();
		
		
		Writer w= new FileWriter(file);
		
		String s="Rangadu";
		
		w.write(s);
		
		w.close();
		
		
	Integer [] arr= new Integer[4];
		arr[0]=1;
		System.out.println(arr);
		

	}

}
