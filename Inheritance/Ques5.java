/*Design a class employee of an organization. An employee has a name, empid, and salary. Write
the default constructor, a constructor with parameters (name, empid, and salary) and methods to
return name and salary. Also write a method increaseSalary that raises the employee’s salary by a
certain user specified percentage. Derive a subclass Manager from employee. Add an instance
variable named department to the manager class. Supply a test program that uses theses classes
and methods.*/

class Employee{
	String name,empid;
	float salary;
	Employee(){
	}
	Employee(String name, String empid, float salary){ 
	/*
	parameterised constructor
	*/
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	String getName(){
	/*
	method to return Name
	*/
		return this.name;
	}
	float getSalary(){
	/*
	method return Salary
	*/
		return this.salary;
	}
	void increaseSalary(float percentage){
	/*method to increase salary	*/
		float p = percentage/100;
		this.salary = this.salary + this.salary * p;	
	}
}
class Manager extends Employee{
	String department;
	Manager(String name, String empid, float salary, String department){
		super(name, empid, salary);
		this.department = department;
	}
	String getDept(){
		return this.department;
	}
}
public class Ques5{
	public static void main(String args[]){
		Manager emp = new Manager("Raj","E1",10000,"Technical");
		System.out.println("Name:"+ emp.getName());
		System.out.println("Salary:"+ emp.getSalary());
		emp.increaseSalary(20);//increasing salary by 20%
		System.out.println("Updated Salary:"+ emp.getSalary());
		System.out.println("Department:"+ emp.getDept());
	}
}
