/*Write a program in Java to read a statement from console, convert it into upper case and again
print on console. (Don’t use inbuilt function)*/

import java.util.*;
class Ques3{
	static boolean isUpperCase(char ch){
    	return ch >= 'A' && ch <= 'Z';
	}
		
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String: ");  
        String str = in.nextLine();
        
		int len = str.length();
		
		char[] ch = new char[len];
		
		for(int i=0; i<len; i++){
			ch [i] = str.charAt(i);
			
			if(!(isUpperCase(ch[i]) || (ch[i]==' ') )){
				ch[i] = (char)(ch[i]-32);
			}
		}
		
		System.out.println(new String(ch));
		
	}
}
