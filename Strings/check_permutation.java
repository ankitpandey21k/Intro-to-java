Sample Input 1:
                 abcde
                 baedc
Sample Output 1:
                 true
Sample Input 2:
                 abc
                 cbd
Sample Output 2:
                false

			
			
package Strings;
import java.util.Scanner;
public class check_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		String str1=scn.nextLine();
		
		boolean ans=ispermutation(str,str1);
		System.out.println(ans);
	}
	public static boolean ispermutation(String str, String str1) {
		// TODO Auto-generated method stub
		int arr1[] = new int[26];
		for (int i = 0; i < str.length(); i++) {
			int a = ((int) str.charAt(i) - 97);
			arr1[a] += 1;
		}
		int arr2[] = new int[26];
		for (int i = 0; i < str1.length(); i++) {
			int a = ((int) str1.charAt(i) - 97);
			arr2[a] += 1;
		}
		for(int i = 0 ;i<26; i++){
			if(arr1[i]!=arr2[i]){
				return false;
			}
		}
		return true;
	}
}
