class Player{
	Player(){
		System.out.println("You called a Player");	
	}
}
class CricketPlayer extends Player{ //CricketPlayer inherited Player
	CricketPlayer(){
		System.out.println("CricketPlayer inherited Player");
	}

}
class FootballPlayer extends Player{//FootballPlayer inherited Player
	FootballPlayer(){
		System.out.println("FootballPlayer inherited Player");
	}

}
class HockeyPlayer extends Player{//HockeyPlayer inherited Player
	HockeyPlayer(){
		System.out.println("HockeyPlayer inherited Player");
	}

}

public class Ques2{

	Ques2(){
		System.out.println("All classes inherited..");
	}
	public static void main( String args[]){
		Ques2 a = new Ques2();
		
	}
}

