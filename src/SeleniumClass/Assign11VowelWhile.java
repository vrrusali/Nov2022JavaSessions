
package SeleniumClass;
/*Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.*/

public class Assign11VowelWhile {

	public static void main(String[] args) {
		
		char i='a';
		while (i<='z')
		{
		switch(i){
		case 'a':
			System.out.println("vowel a");
			break;
		case 'e':
			System.out.println("vowel e");
			break;	
		case 'i':
			System.out.println("vowel i");
			break;
		case 'o':
			System.out.println("vowel o");
			break;
		case 'u':
			System.out.println("vowel u");
			break;	

		default:
			System.out.println(i+ " not a vowel");
			break;
		}
		i++;
		}
     }
}
