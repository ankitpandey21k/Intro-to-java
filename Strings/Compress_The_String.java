//Sample Input 1:
//                aaabbccdsa
//Sample Output 1:
//                a3b2c2dsa

//Explanation for Sample Output 1:
//In the given string 'a' is repeated 3 times, 'b' is repeated 2 times, 'c' is repeated 2 times and 'd', 's' and 'a' and occuring 1
//time hence no compression for last 3 characters.

//Sample Input 2:
//               aaabbcddeeeee
//Sample Output 2:
//               a3b2cd2e5

//Explanation for Sample Output 2:
//In the given string 'a' is repeated 3 times, 'b' is repeated 2 times, 'c' is occuring single time, 'd' is repeating 2 times and 'e' is 
//repeating 5times.
package Strings;

import java.util.Scanner;

public class Compress_The_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    String str=s.next();
	    String ans=compressString(str);
	    System.out.println(ans);
	    
		
	}

	public static String compressString(String str) {
		// TODO Auto-generated method stub
		char ch = str.charAt(0);
		String s = "";
		int c = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != ch && c != 1) {
				s += ch + Integer.toString(c);
				ch = str.charAt(i);
				c = 1;
			} else if (str.charAt(i) != ch && c == 1) {
				s += ch;
				ch = str.charAt(i);
				c = 1;
			} else {
				c++;
			}
		}
		if (c == 1) {
			return s + ch;
		} else {
			return s + ch + Integer.toString(c);
		}
	}
	}
