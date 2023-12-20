package com.stream.io.concepts;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamEx1 {

	public static void main(String[] args) throws IOException {
		
		File file= new File("./OutputEx3.txt");
		
		File f1= new File("./OutputEx1.txt");
		File f2= new File("./OutputEx2.txt");
		
		FileOutputStream fos1= new FileOutputStream(f1);
		FileOutputStream fos2= new FileOutputStream(f2);
		
		ByteArrayOutputStream byteArrayInputStream= new ByteArrayOutputStream();
		
		byteArrayInputStream.write(86);
		
		byteArrayInputStream.writeTo(fos1);
		byteArrayInputStream.writeTo(fos2);
	}

}
