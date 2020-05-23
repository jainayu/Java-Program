/*Write a program to launch 10 threads. Each thread increments a counter variable. Run the program with synchronization.*/

class MyThread extends Thread{
	static int i=0;
	public void run(){
		System.out.println(this.i++ + "\n");
	} 
}

class Ques3{
	public static void main(String args[]){
		
		MyThread t1[] = new MyThread[10];
		
		for(int i=0;i<10;i++){
			t1[i] = new MyThread();
			t1[i].start(); 
		}
		
	}
}  
