Sample Input 1:
                abc
  Sample Output 1:
                a 
                ab 
                abc 
                b 
                bc 
                c 

package strings;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="pqrs";
		printSubstring(str);

	}

	public static void printSubstring(String str) {
		// TODO Auto-generated method stub
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				System.out.println(str.substring(i,j+1));
			}
	}

}
}
