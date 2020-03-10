/*On a single track two vehicles are running. As vehicles are going in same direction there is no
problem. If the vehicles are running in different direction there is a chance of collision. To avoid
collisions write a Java program using exception handling. You are free to make necessary
assumptions.*/
class CollisionException extends Exception{
	 
	CollisionException(){ 
		super("Accident will occur..\nStop both vehicle immediately..\nNow vehicle 1 will go in reverse..\n"); 
	}
}

class Ques4{
	
	static void validate(String str1, String str2) throws  CollisionException{  
    	if(!(str1.equalsIgnoreCase(str2)))
    		throw new  CollisionException();
	}  
	
	public static void main(String args[])
	{
		
		try{
		
    		validate(args[0], args[1]);

   		} catch( Exception e){
   				System.out.println("\nException: " + e);
   		}
   		
   		System.out.println("\nEverything is safe...\n");			  

	}
}
