package strings;

import java.util.Scanner;

public class Countwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string:");
		Scanner scn=new Scanner(System.in);
	      String str=scn.nextLine();
	      
	      int count=1;
	      for(int i=0;i<str.length()-1;i++) {
	    	  if((str.charAt(i)==' ' && str.charAt(i+1)!=' ')) {
	    		  count++;
	    	  }
	      }
	      System.out.print("Number of words are present:"+count);
	}
}
*********************************************************************************************************************************************************************
public static int countWords(String str) {	
		//Your code goes here
		if (str.length() == 0 ){
			return 0; 
		}
		String arr[] = str.split(" ");   //string split() function is a method that allows you to split a string into an array of substrings based on a specified delimiter.
		return arr.length;
	}
	
