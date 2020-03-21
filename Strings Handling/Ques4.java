/*Write a program in Java to create a String object. Initialize this object with your name. Find the
length of your name using the appropriate String method. Find whether the character ‘a’ is in
your name or not; if yes find the number of times ‘a’ appears in your name. Print locations of
occurrences of ‘a’ .Try the same for different String objects*/

class Ques4{
	public static void main(String args[]){
	String name = new String("Aayush Jain");
	int len = name.length();
	int j=0;
	int index =0;
	index = name.indexOf('a',-1);
	System.out.print("\nCharacter 'a' is at: ");
	while(index !=-1){
		System.out.print(index+" ");
		index++;
		index = name.indexOf('a',index);
		j++;
	}
	System.out.println("position(s); Total "+j + " times\n");
	}
}
