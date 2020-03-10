/*Write a program to create interface named test. In this interface the member function is square.
Implement this interface in arithmetic class. Create one new class called ToTestInt. In this class
use the object of arithmetic class.*/
interface Test{
	void sqaure(int s);
}
class Arithmetic implements Test{
	public void sqaure(int s){
		System.out.println("I'm Square...");
		System.out.println("And my area is = "+(s*s));
	}
}

class ToTestInt{
	public static void main(String args[]){
		Arithmetic a = new Arithmetic();
		a.sqaure(5);
	}
}

