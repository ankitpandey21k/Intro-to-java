package strings;
public class palindrom {
	public static void reversestring(String str) {
		String reversedstring="";
		for(int i=str.length()-1;i>=0;i--) {
			reversedstring+=str.charAt(i);	
		}
		if(str.toLowerCase().equals(reversedstring.toLowerCase()))   {
			System.out.println(str+" is palindrome string");	
		}
		else {
			System.out.println(str+" is not palindrome string");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  str="radar";
	       reversestring(str);
		
	}

}
************************************************************************************************************************************************************************
---------------------------------------------String Palindrome-----------------------------------------String Palindrome------------------------------------------------
**********************************************************************************************************************************************************************	
Given a string, determine if it is a palindrome, considering only alphanumeric characters.
Palindrome
A palindrome is a word, number, phrase, or other sequences of characters which read the same backwards and forwards.
	Input Format:
The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
       Output Format:
The only line of output prints either 'true' or 'false'.
	
	Sample Input 1 :
abcdcba
      Sample Output 1 :
true 
     Sample Input 2:
coding
     Sample Output 2:
false
	
	public class Solution {

	public static boolean isPalindrome(String str) {
		// Your code goes here
		int i = 0;
		int n = str.length() - 1;
		while (i <= n) {
			if (str.charAt(i) != str.charAt(n)) {
				return false;
			}
			i++;
			n--;
		}
		return true;
	}
}
