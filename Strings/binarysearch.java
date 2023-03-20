package strings;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40,50,60,70,80,90};
		System.out.println(Binarysearch(a,0,a.length-1,40));
 
	}

	private static int Binarysearch(int[] a, int si, int ei, int x) {
		// TODO Auto-generated method stub
		if(si>ei) {
			return -1;
		}
		int midindex=(si+ei)/2;
		if(a[midindex]==x) {
			return midindex;
		}
		else if(a[midindex]<x) {
			return Binarysearch(a,midindex+1,ei,x);
		}
		else {
			return Binarysearch(a,si,midindex-1,x);
		}
		
	}

}
