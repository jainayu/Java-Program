/*Consider the trunk calls of a telephone exchange. A trunk call can be ordinary, urgent or
lightning. The charges depend on the duration and the type of the call. Write a program using the
concept of polymorphism in Java to calculate the charges.*/

class Trunk{
	int charges(int duration){
		return duration * 10;	
	}
}

class Urgent extends Trunk{
	int charges(int duration){
		return duration * 15;	
	}
}

class Lightning extends Trunk{
	int charges(int duration){
		return duration * 20;	
	}
}

public class Ques4{
	public static void main(String args[]){
		Trunk ordinary = new Trunk();
		Urgent urgent = new Urgent();
		Lightning lightning = new Lightning();
		
		int o = ordinary.charges(2);
		int u = urgent.charges(3);
		int l = lightning.charges(3);
		
		System.out.println("Ordinary call charges "+o);
		System.out.println("Urgent call charges "+u);
		System.out.println("Lightning call charges "+l);
	}
}


