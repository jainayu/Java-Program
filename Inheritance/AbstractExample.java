abstract class hello{			// abstract class
	abstract void a();			// abstract method
	abstract void b();			// abstract method
	void c(){
		 System.out.println("i'm c ");
	}
}

class world extends hello{		// concrete class world inherits 
								// from abstract class hello
	
	world(int i){				// parameterized constructer				
	 System.out.println("i'm world "+ i);
	}
	
	void a(){					// defination of abstract method a()
		 System.out.println("i'm a ");
	
	}
	void b(){					// defination of abstract method b()
		 System.out.println("i'm b ");
	}

}

public class hi extends world{

	hi(){						// constructer	
		super(1);				// It will get an error if super is not called with any integer value.
							    
	}

	public static void main(String args[]){	//main() method
		hi s = new hi();					//instantion of class
		s.a();					//calling a()
		s.b();					//calling b()
	}

}
