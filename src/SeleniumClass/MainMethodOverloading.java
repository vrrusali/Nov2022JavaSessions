package SeleniumClass;

import java.util.Arrays;

public class MainMethodOverloading {

	// JVM -- main - PVSM - string[]

	public static void main(String[] a) {
		System.out.println("hello");

		// System.out.println(a[0]);
		System.out.println(Arrays.toString(a));

		MainMethodOverloading.main(20);
		MainMethodOverloading.main(20, 30);
		
		Car.speedTest();

	}

	public static void main(int i) {
		System.out.println(i);
		System.out.println("main 1 param");
	}

	public static void main(int i, int j) {
		System.out.println("main 2 params");
	}

}