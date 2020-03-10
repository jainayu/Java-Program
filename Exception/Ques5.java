/*Write a java program to throw an exception for an employee details.
        -If an employee name is a number, a name exception must be thrown.
        -If an employee age is greater than 50, an age exception must be thrown.
        -Or else an object must be created for the entered employee details*/
import java.util.*;  
class NameException extends Exception{
	NameException(){
		super("Name is Invalid...\n");
	}
}
class AgeException extends Exception{
	AgeException(){
		super("Age is Invalid. Age cannot be above 50...\n");
	}
}
class Employee{
	String name;
	int age;
	
	void setName(String name){
		this.name = name;
	}
	void setAge(int age){
		this.age = age;
	}
	String getName(){
		return this.name;
	}
	int getAge(){
		return this.age;
	}	
	
	void validateName() throws NameException{
		
		if(getName().matches("^[0-9]+$")){
			throw new NameException();
		}
	}
	void validateAge() throws AgeException{
		
		if ((getAge()) > 50){
			throw new AgeException();
		}
	}
}
class Ques5{
	public static void main(String args[]){
	 	Scanner in = new Scanner(System.in);            
        System.out.print("Enter Employee Name: ");  
        String name = in.nextLine();
        System.out.print("Enter Employee Age: ");  
        int age = in.nextInt();
        Employee emp = new Employee();
        emp.setName(name);
        emp.setAge(age);
        try{
			emp.validateName();	
        }
        catch (NameException n) {
        	System.out.println("\nException: " + n );
        }
        try{
        	emp.validateAge();	
        }
        catch (AgeException a) {
        	System.out.println("\nException: " + a );
        }
	}
}
