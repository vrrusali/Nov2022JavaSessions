package SeleniumClass;
/*12. Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow"*/

public class Assign12Multi7While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while (i<=10) {
			System.out.println(i);
			if (i%7==0) {
				System.out.println("Bye, See you tomorrow.");
				break;
			}
			i++;
		}
	}

}
