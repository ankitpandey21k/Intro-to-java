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
//		for(int len=1;len<=str.length();len++) {
//		for(int i=0;i<=str.length()-len;i++) {
//			int j=i+len-1;
//			System.out.println(str.substring(i,j+1));
//	}
//		}
//	}
//}
//public static void main (String[] args) {
//StringBuffer str1=new StringBuffer("");
//for(int i=0;i<5;i++)
//{
//    str1.append((char)('a'+i));
//}
//System.out.println(str1);
}
}
