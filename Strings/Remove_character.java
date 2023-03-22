Sample Input 1:
              aabccbaa
              a
Sample Output 1:
              bccb
Sample Input 2:
             xxyyzxx
              y
Sample Output 2:
             xxzx


package Strings;

import java.util.Scanner;

public class Remove_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        char ch=scn.next().charAt(0);
        String ans=removeCharacter(str,ch);
        System.out.println(ans);
	}

	private static String removeCharacter(String str, char ch) {
		// TODO Auto-generated method stub
		String ans="";
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)!=ch) {
				ans+=str.charAt(i);
			}
		}
		return ans;
	}

}
