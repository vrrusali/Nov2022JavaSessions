package SeleniumClass;

public class WhileLoopCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Counter=100;
		while(Counter>=100) {
			System.out.println(Counter);
			Counter++;
			if (Counter==200) {
				System.out.println("Bye!!");
				break;
			}
		}

	}

}
