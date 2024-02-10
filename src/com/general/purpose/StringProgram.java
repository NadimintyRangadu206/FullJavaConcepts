package com.general.purpose;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class StringProgram {

	public static void main(String[] args) throws IOException {

		String str = "Rangadu";

		for (int i = str.length() - 1; i >= 0; i--) {

			System.out.print(str.charAt(i));
		}

		System.out.println();
		int i = str.length() - 1;

		while (i > 0) {
			System.out.print(str.charAt(i));
			i--;
		}

		System.out.println("2");

		String s2 = "Iam Going to Market";

		String arr[] = s2.split(" ");

		for (int j = arr.length - 1; j >= 0; j--) {
			System.out.print(arr[j] + " ");
		}

		StringTokenizer st = new StringTokenizer(s2, " ");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());

		}

		File file = new File("./StrigFile.txt");

		if (!file.exists()) {
			file.createNewFile();
		}

//	 Reader r=new FileReader(file);

		BufferedReader br = new BufferedReader(new FileReader(file));
		String s3 = new String();
		StringBuilder sb = new StringBuilder();
		while ((s3 = br.readLine()) != null) {

			sb.append(s3);
		}

		String s4 = sb.toString();
		
		String a[]=s4.split(" ");
		
		ArrayList<Integer> list= new ArrayList<>();
		
		Map<String ,Integer> map=new LinkedHashMap<>();
		
		for(String s:a) {
			
			int count=0;
			String rev =""; String temp=s;
			
			for(int k=s.length()-1;k>=0;k--) {
				
				rev+=s.charAt(k);
				count++;
			}
			if(temp.equalsIgnoreCase(rev)) {
				list.add(count);
				map.put(s, count);
			}else {
				System.out.println("Not Palindrome");
			}
			
		}
		
		System.out.println(Collections.max(map.keySet())+ "-"+Collections.max(map.values()));
	System.out.println(Collections.max(list));
	System.out.println(Collections.min(list));
	
	
	String s5="picture perfect";
	
	int fre[] = new int[s5.length()];

	char ch[]=s5.toCharArray();
	for (int k = 0; k < s5.length(); k++) {
		fre[k]=1;
		for (int t = k + 1; t < s5.length(); t++) {

			    if(s5.charAt(k)==s5.charAt(t)) {;
			    	 fre[k]++;
			    	 ch[t]='0';
			    }
		}
	}
	
	for(int k=0;k<fre.length;k++) {
		
		if(ch[k]!=' ' &&  ch[k]!='0') {
			
			System.out.println(ch[k]+"-"+fre[k]);
			
		}
	}

	}

}
