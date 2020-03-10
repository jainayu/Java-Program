/*Write a program in Java to show the usefulness of Interfaces as a place to keep constant value of
the program*/
interface Area{
	static final float pi=3.142f;
	float compute(float x,float y);
}
class Rectangle implements Area{
	public float compute(float x,float y){
		return(x*y);
	}
}
class Circle implements Area{
	public float compute(float x,float y){
		return(pi*x*x);
	}
}
class Ques3{
	public static void main(String args[]){
		Area rect=new Rectangle();
		Area cr=new Circle();
		
		System.out.println("Area of the rectangle= "+rect.compute(10,20));
		
		System.out.println("Area of the circle= "+cr.compute(10,0));
	}
}

