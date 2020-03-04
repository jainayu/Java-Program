/*Write a Java program to show that private member of a super class 
cannot be accessed from derived classes.*/


class base{
	private int hi;
	void method(){
	    System.out.println("You can call me");
	}
}

public class ques1 extends base{
	 public static void main(String args[]){
	 	ques1 q = new ques1();
	 	q.hi = 1;		//you can't access a private member of base from child class
	 }
}

