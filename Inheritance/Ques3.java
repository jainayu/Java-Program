/*Write a class Worker and derive classes DailyWorker and SalariedWorker from it. Every worker
has a name and a salary rate. Write method ComPay (int hours) to compute the week pay of every
worker. A Daily Worker is paid on the basis of the number of days he/she works. The Salaried
Worker gets paid the wage for 40 hours a week no matter what the actual hours are. Test this
program to calculate the pay of workers. You are expected to use the concept of polymorphism to
write this program.*/
class Worker{
	String name;
	int salaryRate;
	Worker(String name, int salaryRate){
		this.name = name;
		this.salaryRate = salaryRate;
	}
    int ComPay(int pay){
        System.out.println("The Pay Of the worker per week is "+pay);
        return 0;
    }
}

class DailyWorker extends Worker{
	DailyWorker(String name, int salaryRate){
		super(name, salaryRate);
	}
    int ComPay(int hours){
        int pay=hours*1000;
        return pay; 
    }
}

class SalariedWorker extends Worker{
	SalariedWorker(String name, int salaryRate){
		super(name, salaryRate);
	}
    int ComPay(int hours){
        int pay=hours*1000;
        return pay; 
    }
}

public class Ques3{
	public static void main(String[] args){
	    Worker w = new Worker("Ram", 1000);
    	Worker w1 = new DailyWorker("Shyam", 1000);
    	Worker w2 = new SalariedWorker("Raju", 1000);
    	    
		System.out.println("Wage per hour: 1000");
    	System.out.println("Number of hours daily workers work per week: 10");
        
    	int a = w1.ComPay(10);
    	int b = w2.ComPay(40);
        
    	System.out.println("Daily Worker:");
    	w.ComPay(a);
    	System.out.println("Salaried Worker:");
    	w.ComPay(b);
    }
}
