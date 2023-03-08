package SeleniumClass;

public class NestedForLoop {

	public static void main(String[] args) {
//		00 01 02 03 04 05 
//		10 11 12 13 14 15 
//		20 21 22 23 24 25 
//		30 31 32 33 34 35 
//		40 41 42 43 44 45 
//		50 51 52 53 54 55 
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5;j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}//Complexity index=1
		
		System.out.println("--------------------------------------------------------------");
		for(int p=0;p<=5;p++) {
			for(int q=0;q<=5;q++) {
				System.out.print(p+""+q+" ");
				break;
			}
			System.out.println();
		}

		System.out.println("--------------------------------------------------------------");
		for(int x=0;x<=5;x++) {
			for(int y=0;y<=5;y++) {
				System.out.print(x+""+y+" ");
			}
			break;
		}
		
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		for(int l=0;l<=5;l++) {
			for(int m=0;m<=5;m++) {
				for(int n=0;n<=5;n++) {
				System.out.print(l+""+m+""+n+" ");
			}
//			break;
			System.out.println();
		}
	}
	}
}
