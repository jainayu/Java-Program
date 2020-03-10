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

