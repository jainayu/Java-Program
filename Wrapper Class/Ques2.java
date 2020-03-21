/*Write a Java code that converts float to Float converts Float to String converts String to float
converts float to String converts String to Float converts Float to float.*/
class Ques2{
	public static void main(String args[]){
		float a =(float)5.5;
		//converting float to Float..
		Float f = Float.valueOf(a);
		//converting Float to string..
		String str = Float.toString(f);
		/*
		converting String to int..
		int result = Integer.parseInt(str);
		*/
		//converting float to String..
		String str1 = Float.toString(a);
		//converting String to Float..
		Float j = Float.valueOf(Float.parseFloat(str));
		//converting Integer to int..
		float n = f.floatValue();
		System.out.println("All conversions are successfully executed...");
		
	}
}
