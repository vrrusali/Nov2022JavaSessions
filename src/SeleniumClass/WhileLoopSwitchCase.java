package SeleniumClass;

public class WhileLoopSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=1;
		while(score<=100) {
			switch(score) {
			case 25:
				System.out.println(score);
				System.out.println("Score is 25...Yay!!");
				break;
			case 50:
				System.out.println(score);
				System.out.println("Score is 50...Half Century");
				break;
			case 100:
				System.out.println(score);
				System.out.println("Score is 100..Full Century");
				break;
				
			default:
			System.out.println(score);
			break;			
			}
			score++;
		}
	}

}
