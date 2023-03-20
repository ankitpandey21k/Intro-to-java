package strings;

import java.util.Scanner;

public class allpalidrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		Solution(str);

	}

	private static void Solution(String str) {
		// TODO Auto-generated method stub
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				if(isPalindrome(str.substring(i,j))) {
					System.out.println(str.substring(i,j));
					
				}
			}
		}
	}

	private static boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		int i=0,j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
