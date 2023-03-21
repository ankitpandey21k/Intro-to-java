package Strings;

import java.util.Scanner;

public class Remove_consecutive_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		String ans=removeConsecutiveDuplicates(str);
		System.out.println(ans);
		

	}

	public static String removeConsecutiveDuplicates(String str) {
		// TODO Auto-generated method stub
		char ch = str.charAt(0);
		String s = "" + ch;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				ch = str.charAt(i);
				s += ch;
			}
		}
		return s;
	}

}
