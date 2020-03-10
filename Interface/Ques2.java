/*Write a program to create interface A, in this interface we have two method meth1 and meth2.
Implements this interface in another class named MyClass.*/
interface A{
	void meth1();
	void meth2();
}

class MyClass implements A{
	public void meth1(){
		System.out.println("Hello, I'm Method 1\n");
	}
	public void meth2(){
		System.out.println("Hello, I'm Method 2\n\n");
	}
	public static void main(String args[]){
		MyClass a = new MyClass();
		a.meth1();
		a.meth2();
	}
}
