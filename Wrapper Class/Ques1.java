/*Write a Java code that converts int to Integer, converts Integer to String, converts String to int,
converts int to String, converts String to Integer converts Integer to int.*/
class Ques1{
	public static void main(String args[]){
		int a =5;
		//converting int to Integer..
		Integer i = Integer.valueOf(a);
		//converting Integer to string..
		String str = Integer.toString(i);
		//converting String to int..
		int result = Integer.parseInt(str);
		//converting int to string..
		String str1 = Integer.toString(a);
		//converting String to Integer..
		Integer j = Integer.valueOf(Integer.parseInt(str));
		//converting Integer to int..
		int n = i.intValue();
		System.out.println("All conversions are successfully executed...");
		
	}
}
