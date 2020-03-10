interface Interface{
	float division (float a, float b);
	float modules(float a, float b);
}
class Ques4 implements Interface{
	public float division (float a, float b){
		return(a/b);
	}
	public float modules(float a, float b){
		return(a%b);
	}
	
	
	public static void main(String args[]){
		Ques4 q = new Ques4();
		
		System.out.println("18 / 3 = "+q.division(18,3));
		System.out.println("18 / 4 = "+q.modules(18,4));
		
	}
}

