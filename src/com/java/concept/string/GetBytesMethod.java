package com.java.concept.string;

import java.io.UnsupportedEncodingException;

public class GetBytesMethod {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String s = "nsjfsfh";

		byte[] b = s.getBytes();

		for (int i : b) {

			String s1 = String.valueOf((char) (i));

			System.out.println(String.format(String.valueOf(i) + ":%4s", s1));
		}

		// Big Endian byte order, 16 - bit UCS Transformation format

//		CharSet
		
		byte[] b1 = s.getBytes("UTF-16"); // Throws the CompiletimeException 1. UTF-17  throws the UnsupportedEncodingException

		for (int i : b1) {
			System.out.print(i);
		}

		System.out.println();
		byte[] b3 = s.getBytes("UTF-16BE"); // Throws the CompiletimeException

		for (int i : b3) {
			System.out.print(i);
		}

		System.out.println();

		byte[] b4 = s.getBytes("ISO-8859-1"); // Throws the CompiletimeException

		for (int i : b4) {
			System.out.print(i);
		}

		System.out.println();

		byte[] b5 = s.getBytes("UTF-16LE"); // Throws the CompiletimeException

		for (int i : b5) {
			System.out.print(i);
		}
	}

}
