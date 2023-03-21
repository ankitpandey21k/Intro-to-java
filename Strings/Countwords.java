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
