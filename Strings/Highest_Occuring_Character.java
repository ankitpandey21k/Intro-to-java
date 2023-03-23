package Strings;

import java.util.Scanner;
import java.lang.String;

public class  Highest_Occuring_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		String str=scn.nextLine();
		 
		char ans=highest_Occuring_Character(str);
		System.out.println(ans);
		

	}

	public static char highest_Occuring_Character(String str) {
		// TODO Auto-generated method stub
		int arr[]=new int[256];
		for(int i=0;i<str.length();i++) {
			int a=((int)str.charAt(i)-65);
			arr[a]+=1;
		}
		int index=0;
		int max=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				index=i;
				max=arr[i];
			}
		}
		
		return (char)(index+65);
	}

}
