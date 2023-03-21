package Strings;

import java.util.Scanner;

public class reverse_each_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str= scn.nextLine();
		
		String ans=ReverseEachWord(str);
		System.out.println(ans);
		

	}

	public static String ReverseEachWord(String str) {
		// TODO Auto-generated method stub
		String a[] = str.split(" ");
		String s = "";
		for (int i = 0; i < a.length; i++) {
			String an = rev(a[i]);
			s += an + " ";
		}
		return s;
	}

	 static String rev(String s) {
		// TODO Auto-generated method stub
		 int h = s.length();
			String st = "";
			for (int i = 0; i < h; i++) {
				st = s.charAt(i) + st;
			}
			return st;
	}

}
