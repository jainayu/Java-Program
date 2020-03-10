/*Write a program in Java to display the names and roll numbers of students. Initialize respective
array variables for 10 students. Handle ArrayIndexOutOfBoundsExeption, so that any such
problem doesn’t cause illegal termination of program.*/
class Ques1{
	public static void main(String args[]){
		int roll[] = {1,2,3,4,5,6,7,8,9,10};
		String name[]={"Ram","Sam","Jam","Pam","Tam","Fam","Sham","Naam","Lam","Om"};
		System.out.println("Roll No.\tName: ");		
		for(int i=0;i<=10;i++){
			try{
  	  			System.out.println(roll[i]+"\t"+name[i]);
	   		}catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
		}
		System.out.println("\nCode is successfully executed...\n");			
	}

}
