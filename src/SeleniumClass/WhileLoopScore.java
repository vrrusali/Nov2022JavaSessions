package SeleniumClass;

public class WhileLoopScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int score=0;
	while(score<=100) {
		System.out.println(score);
		if(score==25) {
			System.out.println("Score is 25..Yay!");
		}
		if (score==50) {
			System.out.println("Score is 50...Half Century");
		}
		if(score==100) {
			System.out.println("Score is  Full Century");
		}
		score++;
	}
	}

}
