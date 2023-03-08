package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b= new BMW();
		b.start();//Overridden
		b.stop();//Inherited
		b.refuel();//Inherited
		b.autoparking();//individual
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		//c.autoparking is not allowed as only Parent class/mthd can be accessed
		
		System.out.println("-----");
		// child class object can be referred by parent class ref variable
		// Top/Up Casting
		Car c1 = new BMW();// Every BMW is a car
		c1.start();
		c1.stop();
		c1.refuel();
		//autoparking is an individual method of BMW so
		//can't be accessible through parent class ref- Ref and parent are different so security check will fail

		// down casting:
		// parent class object can be referred by child class ref variable
		BMW b1 = (BMW) new Car();// ClassCastException at runtime


	}

}
