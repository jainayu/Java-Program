/*Write a program for generating 2 threads, one for printing even numbers and the other for printing odd numbers.*/

class Even extends Thread{
	public void run(){
		for(int i=0;i<=20;i=i+2)		
			System.out.println(i+"\n");
	} 
}
class Odd extends Thread{
	public void run(){
		for(int i=1;i<=20;i=i+2)		
			System.out.println(i+"\n");
	} 
} 
class Ques2{
	public static void main(String args[]){
		
		Even e1 = new Even();
		Odd o1 = new Odd();  
		
		e1.start(); 
		o1.start();
		
	}
}  
