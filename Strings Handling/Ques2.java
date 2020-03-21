/*Write a program for searching strings for the first occurrence of a character or substring and for
the last occurrence of a character or substring.*/

import java.util.*;
class Ques2{
	static boolean isUpperCase(char ch){
    	return ch >= 'A' && ch <= 'Z';
	}
		
	public static void main(String args[]){
		StringBuffer sb = new StringBuffer("Hello World");
		int len = sb.length();
		
		char[] ch = new char[len];
		
		for(int i=0; i<len; i++){
			ch [i] = sb.charAt(i);
			
			if(!(isUpperCase(ch[i]) || (ch[i]==' ') )){
				ch[i] = (char)(ch[i]-32);
			}
		}
		
		StringBuffer newsb = new StringBuffer(new String(ch));
		System.out.println(newsb);
		
	}
}
