/*Write a Java program to enable the user to handle any chance of divide by zero exception.*/
import java.util.*;  
class Ques2{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);            
        System.out.print("Enter number a: ");  
        int a = in.nextInt();
        System.out.print("Enter number b: ");  
        int b = in.nextInt();
        try{  
        	System.out.println(a/b);  
        }  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }
    	System.out.println("\nCode is successfully executed...\n");			  

	}
}

