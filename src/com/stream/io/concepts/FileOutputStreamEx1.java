package com.stream.io.concepts;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx1 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = null;
		BufferedOutputStream bos =null;
		try {
			File file = new File("./OutputEx1.txt");

			if (!file.exists()) {
				file.createNewFile();
				System.out.println("File Is Created Succesfully!");
			} else {
				System.out.println("File Already Exist! Don't Create");
			}

			
				
				
			fos = new FileOutputStream(file);
			bos= new BufferedOutputStream(fos);

			int arr[] = { 1, 2, 50, 45, 77, 55, 88, 90, 120, 87, 76 };

			for (int i : arr) {
				fos.write(i);

			}
			System.out.println("\n");
			
			String str="Java FileOutputStream example 2: write string";
			
			byte[] s=str.getBytes();
			
			fos.write(s);
			
			
			
			System.out.println("Date Write on Destination!");

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if(bos!=null) {
				bos.close();
			}
			if (fos != null) {
				fos.close();
			}
			

		}

	}

}
