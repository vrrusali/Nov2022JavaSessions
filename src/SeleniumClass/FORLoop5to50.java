package SeleniumClass;

import javax.swing.Spring;

public class FORLoop5to50 {

	public static void main(String[] args) {
		for(int i=5;i<=50;i++) {
			System.out.println(i);
			if(i%5==0) {
				System.out.println("divisible by 5");
			}
		}

		System.out.println("---------------------------------------------------");
		for(char c='a'; c<='z';c++) {
			System.out.println("ASCII Value of "+c+":"+" "+(int)c);
		}
		
		System.out.println("----------------------------------------------------");
		for(char d='A';d<='Z';d++) {
			System.out.println("ASCII Value of "+d+":"+" "+(int)d);
		}
		
		System.out.println("----------------------------------------------------");
		for(int e=0 ;e<=9; e++) {
			System.out.println("ASCII Value of "+e+":"+" "+(int)e);
		}
		
		System.out.println("----------------------------------------------------");
		for(double f=0 ;f<=10; f++) {
			System.out.println(f);
		}
		
		System.out.println("----------------------------------------------------");
		for(double f=1.1 ;f<=10.0; f++) {
			System.out.println(f);
		}
		
		System.out.println("----------------------------------------------------");
		for(byte b=0 ;b<=10; b++) {
			System.out.println(b);
		}
		
		System.out.println("----------------------------------------------------");
		for(String a="Vrrusali"; a.equals("Vrrusali");){
			System.out.println("hi"+" "+ a);
			break;
		}
	}

}
