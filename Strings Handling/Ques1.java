/*Write a program for searching strings for the first occurrence of a character or substring and for
the last occurrence of a character or substring.(Using string functions)*/

import java.util.*;
class Ques1{
	public static void main(String args[]){
	Scanner in = new Scanner(System.in);            
        System.out.print("Enter String: ");  
        String string = in.nextLine();
        System.out.print("Enter Character or String To be Searched: ");  
        String str = in.nextLine();
        
        int firstIndex = string.indexOf(str);
        int lastIndex = string.lastIndexOf(str);
        
        if(firstIndex == -1){
        	System.out.println("\nString not found...");
        }
        else{
        	System.out.println("\nFirst occurrence of char/string is found at : " + firstIndex);
        	System.out.println("Last occurrence of char/string is found at : " + lastIndex);  
        }
	}
}
