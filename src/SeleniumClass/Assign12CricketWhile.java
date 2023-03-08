package SeleniumClass;
/*Write a cricket score card system using for and while loops:
if(score == 0) -- print - "Zero - duck"
if(score == 25) -- print - "good job"
if(score == 50) -- print - "good job - half century"
if(score == 100) -- print - "good job - century"*/

public class Assign12CricketWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int score=0;
	while(score<=100) {
		System.out.println(score);
		if (score==0) {
			System.out.println("Zero - duck");
		}
		if (score==25) {
			System.out.println("Good Job");
		}
		if (score==50) {
			System.out.println("Good Job - Half Century");
		}
		if (score==100) {
			System.out.println("Good Job - Full Century");
		}
		score++;
	}
	}

}
