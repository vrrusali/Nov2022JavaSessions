package InheritanceAssignment;

public class TestHospital {

	public static void main(String[] args) {
		
		System.out.println("Child class details");
		Apollo a= new Apollo();
		a.Patient_Details();
		a.Payment_Details();
		System.out.println("--------------------");
		
		
		System.out.println("Child class details");
		Hospital h= new Hospital();
		h.Patient_Details();
		h.Payment_Details();
		System.out.println("--------------------");
		
		System.out.println("Top/Up Casting Approach");
		Hospital h1= new Apollo();
		h1.Patient_Details();
		h1.Payment_Details();
		h1.MasterRecord();
		//h1.Patient_History()- Not Accessible as it is an individual method of Child(Apollo)
		
		System.out.println("Patient History accessed through child class Apollo- Obj Reference");
		a.Patient_History();
		System.out.println("--------------------------");
		
		System.out.println("Bottom/Down Casting Approach");
		Apollo a1= (Apollo) new Hospital();
		a1.MasterRecord();
	}

}
