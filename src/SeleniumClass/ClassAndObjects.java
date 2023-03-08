package SeleniumClass;

public class ClassAndObjects {

	String name;
	int age;
	String city;

	public static void main(String[] args) {

		ClassAndObjects u1 = new ClassAndObjects();
		u1.name = "Ravi";
		u1.age = 25;
		u1.city = "Pune";

		ClassAndObjects u2 = new ClassAndObjects();
		u2.name = "Anjali";
		u2.age = 27;
		u2.city = "LA";

		ClassAndObjects u3 = new ClassAndObjects();
		u3.name = "Kareem";
		u3.age = 30;
		u3.city = "NY";
		
		u1 = u2 = u3;

		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);

//		u1 = u2;
//		System.out.println(u1.name + " " + u1.age + " " + u1.city);
//		System.out.println(u2.name + " " + u2.age + " " + u2.city);
//		System.out.println(u3.name + " " + u3.age + " " + u3.city);
//		
//		
//		u2 = u3;
//		System.out.println(u1.name + " " + u1.age + " " + u1.city);
//		System.out.println(u2.name + " " + u2.age + " " + u2.city);
//		System.out.println(u3.name + " " + u3.age + " " + u3.city);
//
//		u3 = u1;
//		System.out.println(u1.name + " " + u1.age + " " + u1.city);
//		System.out.println(u2.name + " " + u2.age + " " + u2.city);
//		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		
	}

}




