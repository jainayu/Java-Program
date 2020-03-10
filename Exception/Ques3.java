/*Create an exception class, which throws an exception if operand is nonnumeric in calculating
modules. (Use command line arguments).*/
class NonNumericException extends Exception{
	 
	 NonNumericException(){ 
		super("The value  is non numeric.. \n"); 
	}
}

class Ques3{
	
	static void validate(String num) throws  NonNumericException{  
    	if(!num.matches("^[0-9]+$"))
    		throw new  NonNumericException();
	}  
	
	public static void main(String args[])
	{
		
		try{
    		validate(args[0]);
    		validate(args[1]);
    		System.out.println(Integer.parseInt(args[0]) % Integer.parseInt(args[1]));   

   		} catch( Exception e){
   				System.out.println("\nException: " + e);
   		}
   		
   		System.out.println("\nCode is successfully executed...\n");			  

	}
}
