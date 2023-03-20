package strings;
public class reversestring {
	public static String reversestring(String str) {
		String reversedstring="";
		//for(int i=str.length()-1;i>=0;i--) {
			//reversedstring+=str.charAt(i);	
	//	}
		for(int i=0;i<str.length();i++) {
			reversedstring=str.charAt(i)+reversedstring;
		}
		return reversedstring;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  str="hello my name is om";
	      String reversedstring = reversestring(str);
		System.out.println(reversedstring);

	}

}
