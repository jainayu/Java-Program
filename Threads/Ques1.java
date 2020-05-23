/*Write a program to implement the concept of threading by extending Thread Class and Runnable interface.*/

class ViaRunnableThread implements Runnable{
	public void run(){
		System.out.println("thread is running via Runnable interface...");
	}
	
}  
class ViaThreadClass extends Thread{
	public void run(){
		System.out.println("thread is running via Thread class...");
	} 
} 

class Ques1{
	public static void main(String args[]){
		ViaRunnableThread r1=new ViaRunnableThread();
		Thread t1 =new Thread(r1);
		
		ViaThreadClass c1=new ViaThreadClass();  
		
		t1.start(); 
		c1.start();
		
	}
}  
