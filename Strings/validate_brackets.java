/*  Q.  Given a string s containing  just the characters '(','),'{','}','['and']', determine if  the input string is valid.
 * An input string is valid if.
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order. 
 * Every close brackets has a corresponding open bracket of the same type.
 * input: s="()[]{}"
 * output:  true
 * input: s="(]"
 * output: false    
 */

package Strings;

import java.util.Stack;

public class validate_brackets {

	public static void main(String[] args) {
		String s="(){}[]";
		boolean status=validateBrackets(s);
		System.out.println(s);
		System.out.print(status);
	}

	private static boolean validateBrackets(String s) {
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			  if(ch=='}') {
				  if(stack.peek()=='{') {
					  stack.pop();
				  }else 
				  return false;
			  }
			  else if(ch==')') {
				  if(stack.peek()=='(') {
					  stack.pop();
				  }else
				  return false;
			  }
			  else if(ch==']') {
				  if(stack.peek()=='[') {
					  stack.pop();
				  }else
				  return false;
			  }
			  else {
				  stack.push(ch);
			  }
		}
			  if(stack.size()==0) {
				  return true;	  
			  }
		return false;
	}

}
