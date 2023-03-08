package SeleniumClass;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String browser = "chrome";

		switch (browser) {
		case "chrome":
			System.out.println("chrome is launched");
			break;
		case "firefox":
			System.out.println("ff is launched");
			break;
		case "safari":
			System.out.println("safari is launched");
			break;
		case "edge":
			System.out.println("edge is launched");
			break;
		default:
			System.out.println("invalid browser....plz pass the right browser");
			break;
			
		case "naveen":
			System.out.println("naveen is launched");
			break;
		}
		
		//Switch- Case for Numeric cases
		System.out.println("--------------------Switch-Case for Numeric cases----------------------");
		int marks = 90;
		switch (marks) {
		case 90:
			System.out.println("grade A");
			break;
		case 80:
			System.out.println("grade B");
			break;
		case 70:
			System.out.println("grade C");
			break;	

		default:
			System.out.println("FAIL");
			break;
		}
		
		//
		//real time of switch case use cases:
		//1. cross browser logic
		//2. ecomm - multiple countries - langauge
		//3. multi environment: DEV, QA, STAGE, UAT, PROD
		//4. API methods: GET, POST, PUT, DELETE
		//5. DropDown: Single, Multiple, All
		//6. Payment Methods: CC, UPI, PAYPAL, Xoom, WU, BANK
	}

}
