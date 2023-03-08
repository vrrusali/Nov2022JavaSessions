package SeleniumClass;

public class WhileBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		while(num<=100) {
			System.out.println(num);
			if(num%5==0) {
				System.out.println("hi");
				break;
			}
			num++;
	}
	}
}
