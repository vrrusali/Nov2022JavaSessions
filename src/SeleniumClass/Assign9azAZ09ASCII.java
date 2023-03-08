package SeleniumClass;

public class Assign9azAZ09ASCII {

	public static void main(String[] args) {
		//9. Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.
		//Print a-z
		char i='a';
		while(i<='z') {
			System.out.println((int)i);
			i++;
		}
		System.out.println("------------------------------------------------");
		//Print A-Z
				char j='A';
				while(j<='Z') {
					System.out.println((int)j);
					j++;
				}
				
		System.out.println("------------------------------------------------");
		//Print A-Z
				char n2='0';
				while(n2<='9') {
				System.out.println((int)n2);
				n2++;
				}
	}

}
