package com.common;

public class SerializationString {

	public static String specialization(String[] a) {

		String s = new String();

		for (String str : a) {
			String t1 = "=";
			StringBuilder sb = new StringBuilder(str);

			int count = 0;
			StringBuilder sb1 = new StringBuilder();
			for (int i = 0; i < str.length(); i++) {

				if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z'
						|| str.charAt(i) >= '0' && str.charAt(i) <= '9'
						|| str.charAt(i) >= (char) 10 && str.charAt(i) <= (char) 45) {
					count++;
				}

			}
			String r = String.valueOf(count);
//	s+=sb.append(count).append(t1).toString();
//			s+=r+sb.append(t1).toString();

			s += sb1.append(count).append(sb.append(t1));

		}

		return s;

	}

	public static void main(String[] args) {

		String arr[] = { "dhan", "4555dsfg", "this is String", "'" };
		System.out.println(SerializationString.specialization(arr));
	}

}
