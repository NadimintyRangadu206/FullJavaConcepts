package com.stream.io.concepts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

public class OProgram1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		File file = new File("./text.txt");

		if (file.exists()) {
			System.out.println("File is Found!");

		}

		BufferedReader br = new BufferedReader(new FileReader(file));

		String s;
		String str = new String();
		
		while ((s = br.readLine()) != null) {

			str += s;
		}

		FileOutputStream fos = new FileOutputStream(file);
		
		BufferedWriter bw= new BufferedWriter(new FileWriter(file));
		
		bw.append(str).append("How r u");

		int i = 78;

//		for (int j = 65; j <= 99; j++) {
//
//		}
//		fos.write((char) i)+fos.;

	}

}
