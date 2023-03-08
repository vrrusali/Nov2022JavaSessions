package SeleniumClass;

public class DoWhileLoopEx {

	public static void main(String[] args) {
		int p=1;
		do {
			System.out.println(p);
			p++;
		}
		while(p<=10);
		
		System.out.println("-----------------------------------");
		int k=1;
		do {
			k++;
			System.out.println(k);
			}
		while(k<=10);
		
		System.out.println("-----------------------------------");
		int l=1;
		do {
			l++;
			System.out.println(l);
			l++;
			}
		while(l<=10);
		
		System.out.println("-----------------------------------");
		int m=1;
		do {
			System.out.println(m);
			m++;
			}
		while(m>=10);
		
		System.out.println("-----------------------------------");
		int n=1;
		do {
			System.out.println(n);
			
			if(n==10) {
				break;
			}
			n++;
			}
		while(n<=50);
	}

}
