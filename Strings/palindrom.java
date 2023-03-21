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
