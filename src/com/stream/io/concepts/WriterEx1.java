package com.stream.io.concepts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class WriterEx1 {

	public static void main(String[] args) throws IOException {

		File file = new File("./OutputEx3.txt");

		file.createNewFile();

		FileInputStream fileInputStream = new FileInputStream("./OutputEx1.txt");

		StringBuffer sb = new StringBuffer();
		int i = 0;

		while ((i = fileInputStream.read()) != -1) {

			sb.append((char) i);

		}

		Writer w = new FileWriter(file);
		String str = "Hello, welcome to Microsoft Traffic";

		w.append(String.format("Title:%30s", str) + "\n").append(String.format("Name:%10s", sb));

		w.close();
		fileInputStream.close();

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String read = null;

		StringBuffer sb1 = new StringBuffer();
		while ((read = br.readLine()) != null) {
			sb1.append((read));
		}
		System.out.println(sb1.toString());

		List<String> listOfWords = new ArrayList<>();

		String s = sb1.toString();
		System.out.println(s);

		StringTokenizer st = new StringTokenizer(s, " ");

		while (st.hasMoreTokens()) {
			listOfWords.add(st.nextToken());
		}

		Long count = listOfWords.stream().collect(Collectors.counting());
		System.out.println(count);

	}

}
