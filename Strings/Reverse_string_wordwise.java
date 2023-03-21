Sample Input 2:
           Always indent your code
Sample Output 2:
          code your indent Always
---------------------------------------------------------------------
package strings;

import java.util.Scanner;

public class Reverse_string_wordwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		 String str=scn.nextLine();
		 System.out.println(reversStringWordWise(str));
	}
		// TODO Auto-generated method stub
		static void rev(String arr[]) {
			int i = 0;
			int l = arr.length - 1;
			while (i < l) {
				String temp = new String(arr[i]);
				arr[i] = arr[l];
				arr[l] = temp;
				l--;
				i++;
			}
		}

		public static String reversStringWordWise(String str) {
			// Write your code here
			String arr[] = str.split(" ");
			rev(arr);
			String s = "";
			for (int i = 0; i < arr.length; i++) {
				s += arr[i] + " ";
			}
			return s;

		}
	}
***************************************************************************************************************************************************************
        int end=input.length();
	int i=input.length()-1;
	String output="";
	while(i>=0){
		if( input.charAt(i)==' '){
			output+=input.substring(i+1,end)+" ";
			end=i;
		}
		i--;
	}
	output+=input.substring(i+1,end);
	return output;

